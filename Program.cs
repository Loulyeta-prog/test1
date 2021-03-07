using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Finde die geheime Zahl zwischen 0 und 100");
            Console.WriteLine("Gib eine beliebige Zahl zwischen 0 und 100 ein");

            string benutzerEingabe;
            int geheimzahl;
            bool beenden = false;

            Random Zufallszahl = new Random();
            geheimzahl = Zufallszahl.Next(0, 100);

            while(beenden ==false)
            {
                benutzerEingabe = Console.ReadLine();

                if (Convert.ToInt16(benutzerEingabe) == geheimzahl)
                {
                    Console.WriteLine("Herzlichen Glückwunsch, Sie haben die geheime Zahl gefunden");
                beenden = true;
                }
                else if (Convert.ToInt16(benutzerEingabe) > geheimzahl)
                {
                    Console.WriteLine("Die gesuchte Zahl ist kleiner");
                }
                else if (Convert.ToInt16(benutzerEingabe) < geheimzahl)
                {
                    Console.WriteLine("Die gesuchte Zahl ist größer");
                }



            }





            }
    }
}
