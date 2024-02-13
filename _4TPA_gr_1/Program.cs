using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _4TPA_gr_1
{
    public  class Program
    {



        static void Main(string[] args)
        {
            Encapsulation encapsulation = new Encapsulation("dfdsfdsdf", "fdfdfdfdf");


            Console.WriteLine(encapsulation.FirstName + " " + encapsulation.LastName);


            Console.ReadKey();


        }
    }
}
