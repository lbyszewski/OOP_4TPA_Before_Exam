using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _4TPA_gr_1
{
    public class ChildOne : Parent
    {
        private string logic;

        public ChildOne(int id, string name, int age, string logic) : base(id, name, age)
        {
            this.logic = logic;
        }


        public void show()
        {
            Console.WriteLine(" i am child !!!");
        }
    }
}
