using System.Collections.Generic;
using API_Rest_V1.Data;
using API_Rest_V1.Models;
using Microsoft.AspNetCore.Mvc;

namespace API_Rest_V1.Controllers
{
    //api/commands
    [Route("api/commands")]
    [ApiController]
    public class CommandsController : ControllerBase
    {
        //private readonly MockCommanderRepo _repository = new MockCommanderRepo();
        private readonly ICommanderRepo _repository;

        public CommandsController(ICommanderRepo repository)
        {
            this._repository = repository;
        }
        
        // GET api/commands
        [HttpGet] 
        public ActionResult <IEnumerable<Command>> GetAllCommands()
        {
            var commandItems = _repository.GetAppCommands();

            return Ok(commandItems);
        }

        // GET api/commands/{id}
        [HttpGet("{id}")]
        public ActionResult<Command> GetCommandById(int id)
        {
            var commandItems = _repository.GetCommandById(id);

            return Ok(commandItems);
        }
    }
}   