using System.Collections.Generic;
using API_Rest_V1.Models;

namespace API_Rest_V1.Data
{
    public interface ICommanderRepo
    {
        IEnumerable<Command> GetAppCommands();
        Command GetCommandById(int id);
    }
}