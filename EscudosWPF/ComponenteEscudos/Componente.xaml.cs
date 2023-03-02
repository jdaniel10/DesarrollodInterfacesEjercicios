using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace EscudosWPF.ComponenteEscudos
{
    /// <summary>
    /// Lógica de interacción para Componente.xaml
    /// </summary>
    public partial class Componente : UserControl
    {
        public String nombreEquipo { get; set; }

        public Componente()
        {
            InitializeComponent();
            if (nombreEquipo == "BARCELONA")
            {
                imagenEscudo.Source = new BitmapImage(new Uri(".\\ImagenesEscudos\\Barcelona.png"));
                imagenPais.Source = new BitmapImage(new Uri(".\\ImagenesEscudos\\espana.jpg"));
                lblNombre.Content = "Barcelona";
            }
            else if (nombreEquipo == "BETIS")
            {
                imagenEscudo.Source = new BitmapImage(new Uri(".\\ImagenesEscudos\\Betis.png"));
                imagenPais.Source = new BitmapImage(new Uri(".\\ImagenesEscudos\\espana.jpg"));
                lblNombre.Content = "Betis";
            }
            else if (nombreEquipo == "SEVILLA")
            {
                imagenEscudo.Source = new BitmapImage(new Uri(".\\ImagenesEscudos\\Sevilla.png"));
                imagenPais.Source = new BitmapImage(new Uri(".\\ImagenesEscudos\\espana.jpg"));
                lblNombre.Content = "Sevilla";
            }
        }


        
    }
}

