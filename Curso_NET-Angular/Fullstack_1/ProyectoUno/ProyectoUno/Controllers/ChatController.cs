using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
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
    }
}