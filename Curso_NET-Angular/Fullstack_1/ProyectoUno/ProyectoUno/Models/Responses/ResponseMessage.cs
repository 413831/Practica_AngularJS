using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ProyectoUno.Models.Responses
{
    /***
     * Clase para mapear respuestas de Post y Get
     * ***/
    public class ResponseMessage
    {
        public int Success { get; set; }
        public string Message { get; set; }
        public object Data { get; set; }
    }
}
