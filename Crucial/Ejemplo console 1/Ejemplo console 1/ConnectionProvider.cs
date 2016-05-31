using System;
using System.Configuration;
using System.Data;
using System.Data.Common;
using System.Text;


namespace Ejemplo_console_1
{
    class ConnectionProvider
    {
        private String DBName;
        private String DBPort;


        public DbConnection getConnection() {

            DataTable table = DbProviderFactories.GetFactoryClasses();

            
            foreach (DataRow row in table.Rows) {
                foreach(DataColumn column in table.Columns) {
                    Console.WriteLine(row[column]);
                }
            }

            ConnectionStringSettings connectionStringSettings = ConfigurationManager.ConnectionStrings["MySQL Data Provider"];
            DbProviderFactory factory = DbProviderFactories.GetFactory(connectionStringSettings.ProviderName);

            DbConnection conn = factory.CreateConnection();

            conn.ConnectionString = connectionStringSettings.ConnectionString;
            Console.WriteLine(conn);
            conn.Open();
            /*
            System.Data.OleDb.OleDbConnection conn = new System.Data.OleDb.OleDbConnection();

            try {
                conn.ConnectionString = "Provider=MySQLProv; Data Source=10.0.2.15,3306; Initial Catalog=test; User ID=root; Password=omaromar";
                conn.Open();
            }
            catch (System.Data.OleDb.OleDbException ex) {
                Console.WriteLine("Failed to open conecction to Mysql. Details: " + ex.Message);
            }
            */

            /*
            ConnectionStringSettingsCollection settings = ConfigurationManager.ConnectionStrings;

            if(settings != null){
                foreach(ConnectionStringSettings cs in settings)
                {
                    Console.WriteLine(cs.ConnectionString);
                }

            }
            
            */
             /*

            String provider = "MySql.Data.MySqlClient";
            String connectionString = "SERVER=10.0.2.15;UID=root;PASSWORD=omaromar";




            DbProviderFactory factory = DbProviderFactories.GetFactory(provider);
            DbConnection conn = factory.CreateConnection();

            conn.ConnectionString = connectionString;

            try
            {
                Console.WriteLine("Conexion exitosa");
            }
            catch {
                Console.WriteLine(" La conexión falló");

            }
            */
            
            return conn;
        }

        public void setDBName(String DBName) {
            this.DBName = DBName;
        }

        public void setDBPort(String DBPort) {
            this.DBPort = DBPort;
        }

        public String getDBName() {
            return this.DBName;
        }

        public String getDBPort() {
            return this.DBPort;
        }
    }
}
