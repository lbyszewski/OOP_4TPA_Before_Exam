using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _4TPA_gr_1
{
    public class Parent
    {
        protected int id;
        protected string name;
        protected int age;

        protected int Id { get => id; set => id = value; }
        protected string Name { get => name; set => name = value; }
        protected int Age { get => age; set => age = value; }

        public Parent(int id, string name, int age)
        {
            this.id = id;
            this.name = name;
            this.age = age;
        }


        public void show()
        {
            Console.WriteLine(" i am parent !!!");
        }
    }
}
