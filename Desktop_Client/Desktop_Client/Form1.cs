using Desktop_Client.ServiceReference1;
using Desktop_Client.ServiceReference2;

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Desktop_Client
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void soapWS_Click(object sender, EventArgs e)
        {
            ServiceReference1.Service1Client client = new ServiceReference1.Service1Client();
            if (client.PayUserBills(textBox1.Text, textBox2.Text) == true)
                MessageBox.Show("true");
            else MessageBox.Show("false");
            client.Close();

        }

        private void BankSoapWS_Click(object sender, EventArgs e)
        {
            ServiceReference2.Service1Client client = new ServiceReference2.Service1Client();
            bool value1 = false;
            bool value2 = false;
            if (textBox3.Text == "true")
                value1 = true;
            else value1 = false;


            if (textBox4.Text == "true")
                value2 = true;
            else value2 = false;

            if (client.GetStatus(value1, value2) == true)
                MessageBox.Show("true");
            else MessageBox.Show("false");
            client.Close();
        }
    }
}
