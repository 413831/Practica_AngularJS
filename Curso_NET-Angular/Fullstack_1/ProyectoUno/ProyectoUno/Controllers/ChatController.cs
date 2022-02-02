using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using ProyectoUno.Models.Responses;
using ProyectoUno.Models.ViewModels;

namespace ProyectoUno.Controllers
{
    [Route("api/[controller]")]
    public class ChatController : Controller
    {
        private Models.MyDBContext db;

        public ChatController(Models.MyDBContext context)
        {
            this.db = context;
        }

        [HttpGet("[action]")]
        public IEnumerable<MessageViewModel> Messages()
        {
            List<MessageViewModel> list = (from d in db.Message
                                         select new MessageViewModel
                                         {
                                             Id = d.Id,
                                             Name = d.Name,
                                             Text = d.Text
                                         }).ToList();

            return list;
        }

        [HttpPost("[action]")]
        public ResponseMessage Add([FromBody]MessageViewModel model)
        {
            ResponseMessage response = new ResponseMessage();

            try
            {
                Models.Message oMessage = new Models.Message();

                // Obtengo valores de Body del POST para Model
                oMessage.Name = model.Name;
                oMessage.Text = model.Text;
                // Agrego objeto al contexto
                this.db.Message.Add(oMessage);
                // Ejecuto el INSERT
                this.db.SaveChanges();

                response.Success = 1;
            }
            catch(Exception ex)
            {
                response.Success = 0;
                response.Message = ex.Message;
            }
            return response;
        }
    }
}