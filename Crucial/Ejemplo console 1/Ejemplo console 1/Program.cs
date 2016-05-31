using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejemplo_console_1
{
    class Program
    {
        static void Main(string[] args)
        {
            String hola = "hola que onda ";
            Console.WriteLine(hola);

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < i; j++) {
                    Console.Write("*");
                }
                Console.WriteLine("");
            }

            ConnectionProvider connection = new ConnectionProvider();

            connection.setDBName("Oracle");
            connection.setDBPort("969");

            Console.WriteLine(connection.getDBName());
            Console.WriteLine(connection.getDBPort());
            Console.WriteLine(connection.getConnection());
        }
    }
}
