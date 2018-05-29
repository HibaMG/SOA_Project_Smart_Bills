using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace General_WCF_Service_For_Testing
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select Service1.svc or Service1.svc.cs at the Solution Explorer and start debugging.
    public class Service1 : IService1
    {
        /// <summary>
        /// it's just a service for testing purposes,
        /// if you pass 1 the return value will be  true
        /// if you pass anything else, you will receive false
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public bool GetStatus(bool value1,bool value2 )
        {
            if (value1 == true  && value2==true)
            { return true; }

            else return false;
        }

      
    }
}
