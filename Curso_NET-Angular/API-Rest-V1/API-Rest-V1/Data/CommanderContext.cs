using API_Rest_V1.Models;
using Microsoft.EntityFrameworkCore;

namespace API_Rest_V1.Data
{
    public class CommanderContext : DbContext
    {
        public CommanderContext(DbContextOptions<CommanderContext> opt) : base(opt)
        {
            
        }

        public DbSet<Command> Commands { get; set; }
    }
}