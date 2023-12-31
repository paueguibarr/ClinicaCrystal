package Jframes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import clases.Conectar;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author paueguibar
 */
public class NuevoPaciente extends javax.swing.JFrame {
    Conectar conn;
    PagPrincipalRecep principal = new PagPrincipalRecep();
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form NuevoPaciente
     */
    public NuevoPaciente() {
        initComponents();
        conn = new Conectar();
        setDate();
    
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        txtHabitacion = new javax.swing.JTextField();
        btnAceptarNP = new javax.swing.JButton();
        btnCancelarNP = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtExpediente = new javax.swing.JTextField();
        boxMedico = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        checkFact = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 245, 255));

        jLabel1.setText("Nombre del Paciente");

        jLabel2.setText("Fecha de Ingreso");

        jLabel3.setText("Sexo");

        jLabel4.setText("Edad");

        jLabel5.setText("Motivo de Ingreso");

        jLabel6.setText("Habitacion");

        jLabel7.setText("Medico");

        btnAceptarNP.setText("Aceptar");
        btnAceptarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarNPActionPerformed(evt);
            }
        });

        btnCancelarNP.setText("Cancelar");
        btnCancelarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNPActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Songti TC", 0, 36)); // NOI18N
        jLabel8.setText("Nuevo Paciente");

        jLabel9.setText("Expediente ");

        boxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abraham Mendoza Saúl", "Abundis Limón Ana Luisa", "Acosta Solís Silverio", "Adame Sosa Luis Roberto", "Aguilar Lozada Víctor Hugo", "Aguilar Rico J. Héctor", "Albert Huerta Jesús", "Albertos Castillo Rubén", "Albisua Cortés Francisco José Ramón Germán", "Alexis Rossainz Frantz", "Álvarez L´Hoeste Jaime de Jesús", "Alvear Morales Ricardo José", "Arminio Barrios María Silvia Coral", "Amaro Zarate Irving", "Anaya Flores Ricardo", "Andrade Bonilla Margarita", "Andrade Platas Jesús Daniel", "Anzora Enríquez Alma Eugenia", "Anzures Ortiz Franco", "Aquino León Eduardo", "Arias Carreón Fernando David", "Argüello Fuentes José Antonio", "Arroyo Coutiño Iber", "Arroyo Kuribreña José Carlos", "Arroyo Zorrilla Miguel Ángel", "Arroyo Zorrilla Rita Luz María", "Avendaño Domínguez Juan Manuel", "Ávila Aguilar Paola", "Ayala Rodríguez Daniel Enrique", "Azcarraga de Lara César Raúl", "Baeza Flores Eduardo", "Baizan Jorge", "Balandra Ortiz José Ignacio", "Balanzar Depraect José Luis", "Barradas y Fernández Víctor Manuel", "Barraza Franco José Antonio", "Barrera Vargas Norma Indira", "Barrón Soto Mauricio Luis", "Bautista Ramírez Agni", "Bazán González Joaquín", "Becerril Hernández José Daniel", "Becerril Toxtle José", "Bello López Portillo Christopher", "Bernal Flores Roberto", "Bibiano Pano Fernando", "Bifano Blanco Jesús Roberto", "Blanco Becerra Ignacio", "Blanco Ramírez Jorge", "Bolio García Elizabeth Del Carmen", "Bonifaz Sánchez Esli Mauricio Omar", "Bonilla Salgado Eduardo", "Briones Landa Carlos Humberto", "Burguete Sesma Óscar", "Buzo Garcidueñas Antonio Yosband", "Cab Figueroa Daniel Javier", "Caballero Rodríguez Juan Carlos", "Cabrera Carrillo Alfredo", "Cabrera Castillo Edwin Omar", "Cabrera Juan Francisco", "Cabrera Vázquez Luis Manuel", "Calderón López Sergio", "Calixto Flores Carlos A.", "Calixto Junco Jonathan Felipe", "Calixto Martínez Cristóbal", "Calva Rodríguez Roberto Guillermo", "Camacho Gutiérrez Sergio Francisco", "Camacho Larios Sergio", "Camacho López Carlos", "Camela Montiel David", "Candia Molina Alejandro Agustín", "Cano Aguilar Cuauhtémoc", "Cano Zago Numa Pompilio", "Cao Romero Reyes Adriana", "Capilla Campos Alejandro", "Capilla Piedras Beatriz Aymé", "Cárdenas Rodríguez Edgar", "Cariño Cepeda César", "Carreño Cuecuecha Juan José de la Cruz", "Carreto Chalini María del Carmen", "Carzolio Trujillo Héctor Alejandro", "Castilla Zenteno Adalberto", "Castillo Campos Lucio Enrique", "Castillo Luna Rogelio", "Castillo Romero Pedro Antonio", "Cepeda Guillén Frank Estéfano", "Cerón Gámez Héctor Jesús", "Cerón Morales José Aurelio", "Cervantes Balderas Jorge", "Cisneros Méndez Surizadith", "Chaparro Rocha Rodrigo", "ChavarríaJacinto Javán Sinuhé", "Chilchoa Loza Celia", "Cholula Torres Jesús Ansberto", "Coeto Caello Gerardo", "Compeán Lorenzana Jesús Alberto", "Contreras Carvajal Dulce María", "Córdova González Iraís", "Córdova López Martín", "Corona Alvarado Ernesto", "Coronado Olea Benjamín Humberto", "Correa Sánchez Marco Antonio", "Cortés Badillo José Rodolfo", "Cortés García Carlos Alberto", "Cortés Hernández Ana María", "Cortés Parraguirre Alejandra", "Crespo Fuentes Sergio", "Crespo Guzmán Raúl", "Cristales Arias Melchor", "Cruz Guzmán Magdiel Adán", "Cruz Medina Cynthia Shanat", "Cruz Montalvo José Enrique", "Ctalán Arizmendi Omar", "Cuahutencos Cortés Óscar", "Cuautli Tapia Leoncio", "Cuéllar López Fernando", "Damacio Román Roberto", "De la Fuente Chacón Alejandro", "De la Rosa Espinosa de los Monteros Beatriz", "Denicia Guevara Eduardo", "Díaz Carvajal Edgar José", "Díaz Gómez José Juan", "Díaz Tome Wenceslao ", "Dupré Aramburu Guillermina", "Eguibar Coeto José Gerardo", "Eguibar Coeto José Pablo", "Enríquez Méndez Rosa Gabriela", "Enríquez Reyes Francisco J. Roberto", "Escamilla Márquez Marco Antonio", "Escamilla Velasco Serafín Edmundo", "Esclusa Ibáñez Martín", "Escobar Rebollar Grace Dayana", "Esperanza González Daniel", "Espinosa Arreola Maritza", "Espinosa González José Miguel", "Espinosa González Omar", "Fernández Álvarez Luis Carlos", "Fernández Rivero José Manuel", "Fernández Vivar Elieser", "Fernández Yarce Rubén Eduardo", "Figueroa García Citlali", "Figueroa Martínez Uriel", "Figueroa Montero David Eduardo", "Figueroa Quiñones Uriel", "Flores Aguilar Aarón Miguel", "Flores Barrera Armando", "Flores Bautista Gabriel", "Flores Bello Liliana", "Flores González José Antonio", "Flores Licea José Luis A.", "Flores Marín Karina", "Flores Nava Victoria", "Flores Tlalmis Pedro", "Flores Villa Jaime", "Franco Cravioto Fernando", "Franco Sánchez Andrés Delfino", "Furlong Zacaula Yolanda", "Galicia Martini Iván", "Gaona Palomo Mary Karla", "García Briones Ángel Tobías", "García Carrillo José Manuel", "García Colmenares Olga", "García Córdova Víctor Hugo", "García Illescas José Eduardo", "García La Rotta Jaime Alejandro", "García Madrid Héctor Hugo", "García Márquez Juan Carlos", "García Márquez Mauricio J.", "García Montserrat", "García Polo María Montserrat", "García Valero Carlos Edgar", "Gil Vargas Manuel", "Gloria Ávila Benjamín", "Godínez Carrillo Alejandro", "Gómez Jaime Mayela Berenice", "Gómez Rangel José Miguel Ángel", "González Anaya Marco Gerardo", "González Espinoza Iván Romarico", "González Frías Celestina", "González Gómez Isaac", "González Herrera Ismael", "González López Rogelio", "González Mendoza Alejandro", "González Miranda Norma Carolina", "González Moreno Rosalba", "González Orduña Ernesto", "González Palafox Mario Alberto", "González Parra Carlos", "González Peña Manuel Arturo", "González Pérez Alma Delia", "González Ríos José Rafael", "González Rogelio", "González Velázquez Alan", "González Zamora Susana", "Grande Popoca Gloria", "Grageda Flores Edgar", "Grajales Monsalva Alejandro", "Grossman García David Mauricio", "Guardado Olivares Julián Guillermo", "Guede Valverde Jorge", "Guerrero Martínez Gustavo Adolfo", "Guzmán Vera Eibar", "Hasfield Arista Fernando", "Hernández Cabrera Ezequías", "Hernández Cinto Angélica", "Hernández Delgado Julio Andrés", "Hernández Domínguez Óscar", "Hernández Fabián Deyanira Soledad", "Hernández Fuentes Adán", "Hernández Mendieta Beatriz", "Hernández Merino Marco Antonio", "Hernández Molina Pascual Mauricio", "Hernández Muñoz Jazmín Gabriela", "Hernández Ortiz Jesús", "Hernández Peredo Abraham", "Hernández Rivero José Manuel", "Hernández Rodríguez Milton Emmanuel", "Hernández Sánchez Jesús", "Hernández Sánchez Joaquín", "Hernández Sánchez Joé", "Hernández Vázquez Javier Ismael", "Hernández Vega Giovanni Ahmed", "Herrera Calderón José Francisco", "Herrera Filio Rafael", "Herrera Tenorio José Gilberto", "Huerta Cervantes José Miguel", "Huerta Moreno Andrea", "Huey Muñoz Huey", "Ibarra Ordóñez Alejandro", "Jaramillo Romero Aldo Hernán", "Jiménez Castillo Raúl", "Jiménez López Jorge Alberto", "Jiménez Mejía Gregorio", "Juan Aguilar Fausto", "Juárez Guerrero Eira Itzel", "Juárez Hernández Miguel", "Juárez Rosete María Rosalía", "Justo Janeiro Jaime Manuel", "Landini  Maldonado Emilio", "Lares Quinto María del Rocío", "Larragoiti Ramírez Carlos Alberto", "Leal Bustamante Luis Rafael", "León García Luis Daniel", "León Luna Hirepan", "Leyva Medellín Edgar Enrique", "Leyva Medellín Jorge Alberto", "Leyva Mora José Enrique Pablo", "Leyva Rendón Juan Domingo", "Lezama Ordaz Lilibeth", "Libreros Castillo Gabriel", "Limón Abundis Ana Luisa", "Lira Cerda Alejandro", "López Bernal Carlos Alberto", "López Cisneros Rodrigo", "López Fragoso Luis Daniel", "López Hernández Annie Elizabeth", "López Herrera Raúl", "López Mena Augusto", "López Muñoz Esmeralda", "López Portillo Crhistopher Bello", "López Zamora Rigoberto", "Lozada Tena Dulce", "Lozano León Carlos Crispin", "Lozano Villalobos Andry Steven", "Lozano Zaraín Fernando", "Lucero Sánchez Celestino Emilio", "Luna Gallardo Ada Belinda", "Machorro Espinosa María Karina", "Made Munguía Yanet", "Madrazo Cabo José Manuel", "Madrigal Navarro José Luis", "Maldonado Bautista Wendy", "Maldonado Santos Pammela", "Manny Zitle Aidé Irasema", "Manrique Ávila José Antonio", "Marín Lozano Carlos", "Marín Ruiz Alejandro Miguel", "Márquez Pérez Alejandro Esteban", "Martin Ramírez Raúl", "Martínez Calva Irving", "Martínez Clavería María Guadalupe", "Martínez Galeno César", "Martínez López Michel", "Martínez Molina Raúl", "Martínez Morales Arturo", "Martínez Pérez Andrés", "Martínez Romero Armando", "Martínez Romero Marco Flavio", "Martínez Vera Alfredo", "Mascarúa Esparza Eduardo", "Mata Castillo María Dolores", "Mayoral Rojas Cinthya", "Medellín Pérez María Fernanda", "Mejía Jiménez Gregorio", "Mejía Ríos Laura Coretta", "Meléndez Valdés Francisco", "Mena Mariné María del Carmen", "Méndez Polanco María del Pilar", "Méndez Vázquez María Isabel", "Mendoza Rodríguez Raúl", "Mercado Martínez Rosa María", "Merlo Pérez Ricardo Isaac", "Meza González Gerardo", "Meza Martínez Sthefania", "Michel Sasia Christine", "Miguel Cruz Enrique", "Mijangos Patiño Carlos", "Miranda Guerrero Daniel", "Miranda Pérez Luis Manuel", "Mojica Contreras Luz Elena", "Mondragón Dávila Nallely", "Monroy Carvajal Agustín", "Monroy Carvajal Rodrigo", "Monsalve Flores Carlos", "Montero García Juan Gregorio", "Monterrosas Luyando David", "Montiel Jarquín Álvaro José", "Morales Flores Raúl", "Morales Méndez Porfirio", "Morales Rosales Gerardo", "Morales Silva Raúl Israel", "Moranchel García Leslie", "Moreno García Jael", "Moreno Ramírez Arturo", "Munive Mendívil Zuleyka", "Muñoz Daniela", "Muñoz Huey Dora", "Nava Ramos Griselda Magdalena", "Nicolás Martínez Norberto", "Niño Flores Armando Alejandro", "Niño Méndez Edgar Ulises", "Núñez Corona Daniel", "Nuricumbo Reyes Armando", "Ochoa Montiel María Escarlet", "Ojeda Reyes Ángel de Jesús", "Oloarte Merinos Daniel", "Olvera Santamaría José Carlos", "Ordóñez de León Armando", "Orea Estudillo Daniel", "Orea Estudillo Daniel", "Orea Schiaffini Francisco Javier", "Orozco Aponte Norma Izchel", "Orrego Ruiz Joaquín", "Ortega Pérez Jacqueline Alin", "Ortiz Domínguez Alejandro", "Ortiz Domínguez Abel", "Ortiz Flores Joel", "Osorio Jáquim Héctor", "Pacheco Carrillo Ana Lilia", "Pacheco Paredes José Guillermo", "Páez Carballo Ignacio", "Palacios Alonso Abraham", "Palacios Gregorio Dulce Esperanza", "Paleta Conde Juan Antonio", "Palomino Alarcón Héctor", "Parra Salazar José Álvaro", "Parra Salazar José Juan", "Parra Salazar Marco Antonio", "Paternina Ramos Iván Rafael", "Patiño Ramos Ramón", "Pavón Flores Jesús", "Pedraza Pérez Paulina", "Peláez Valdes Rubén", "Peña Vergara Manuel Alfonso", "Pérez Ávila Roberto Juvenal", "Pérez Calva Vicente", "Pérez Córdova Gutiérrez Daniela", "Pérez García Luis Fernando ", "Pérez García Miguel Enrique", "Pérez González Gerardo", "Pérez Lima Romero Alejandro", "Pérez Martínez Nathalia", "Pérez Mejía Joaquín", "Pérez Osorno José Raúl Juan", "Pérez Suárez Benjamín ", "Pérez Toriz José Mario Ulises", "Pestaña Jaramillo Flavio Martín", "Pimentel Morales Elia", "Pineda Bernal Rocío", "Pineda Gabriel Guadalupe", "Pineda Gaona Andric Eduardo", "Pineda Somodevilla Ivo Humberto", "Ponciano Guerrero Mateo", "Portillo Vázquez Andrés", "Prado Orozco Eduardo", "Priego Niño Alejandro", "Quiroz Sánchez Rubén", "Ramírez Carranza Raúl Martín", "Ramírez Galindo Iván Alejandro", "Ramírez Limón Giovani", "Ramírez Martínez Bernardo", "Ramírez Núñez Juan Carlos", "Ramírez Sosa David", "Ramírez Vega Roberto", "Ramos Mota Erika Gabriela", "Ramos Salgado Francisco", "Ramos Zúñiga José Antonio", "Rendón Oliva Isauro Emmanuel", "Reyes Gómez Heriberto", "Ricaño Rueda Raúl", "Riedel Caballero Ernesto Nix", "Rivas Juárez José Arturo", "Rivera Muñoz Juan Javier", "Rivera Ruiz Moisés", "Rivera Saldívar Gustavo", "Rivera Silva Fabián Bartolomé", "Rivera Villa Adrián Huematzin", "Rivera Zenteno José Alberto", "Robledo Cardoso Antonio", "Rodríguez Farías Jairo", "Rodríguez López Gisela", "Rodríguez Pendás Francisco", "Rodríguez Salgado María del Refugio", "Rojas Camarillo Soledad", "Rojas Osorio David", "Rojas Ramírez Jorge Ricardo", "Rojas Vera Miguel Ángel", "Rojas Zúñiga Alber Israel", "Romano Flores Víctor Manuel", "Romero Cruz María Mónica Balbina", "Romero Méndez Rubén", "Romero Salinas Armando", "Romero Torres Roberto", "Romero Toxqui Benjamín", "Ronquillo Valverde Anabel del Carmen", "Rosado Ramos José Evit", "Rosales Peláez César", "Rosales Reyna René", "Rossainz Frantz Alexis", "Rueda Alvarado Carlos Ricardo", "Ruiz Blas Marcos Francisco", "Ruiz Cancino Carlos Efrén", "Ruiz Flandes Antonio", "Ruiz y Argüelles Guillermo José", "Salado Doporto Pablo Rafael", "Salas Díaz María del Mar", "Salgado Castro Elsa", "Salinas de la Chausseé Sandra Gabriela", "Salinas Dorantes Carlos Rubén", "Salinas Víquez Carlos Humberto", "Salmón Ramos Alfonso Luis", "Salvatori Rubí José Jaime", "Sánchez Brito Luis Gerardo Gonzaga", "Sánchez Callejas Karla Ithzel", "Sánchez Carrillo Eduardo", "Sánchez Cordero Javier Alejandro", "Sánchez Corona Hugo", "Sánchez Fernández Norberto Justino", "Sánchez Jureidini Gabriel Orlando", "Sánchez Marín Luis Alberto ", "Sánchez Reyes Blas", "Sánchez Rodríguez Armando", "Sánchez Stone Ricardo", "Sánchez Tomay José Antonio", "Sánchez Tovar Hugo Bernardo", "Santander Aldava Rigoberto", "Santillana Arce José Germán", "Santos Enríquez Víctor Hugo", "Schiavon Martínez Jorge", "Segura González José Manuel", "Serrano Flores Carlos Alberto ", "Sevilla y Ruíz Álvaro ", "Sierra Pineda Mario", "Sígala Cervantes Armando", "Silos Gutiérrez Mayra Lizeth", "Simont Zerón Arturo", "Siolo Julio Ángel Miguel", "Shuck Bello Carlos Erik", "Solar Jurado Juan Manuel", "Solís Cordero Fernando David", "Solís Cuahutle Edgar", "Sosa Iglesias Salvador Ángel", "Soto Priante Héctor", "Taboada Cole Alejandro", "Tapia Bonilla Jesús", "Tapia Serrano Itzel Karina", "Tejeda Parra Sergio", "Téllez Bernés Luis Miguel", "Teolotitla Rosales Edgar Omar", "Theurel Vincent Gustavo E.", "Tobón Méndez Emmanuel", "Toledo Yáñez Jesús", "Torre García Eduardo Valentín", "Torres Gómez Salvador Francisco", "Torres Martínez Carlos", "Torres Ortega Aarón Edgar", "Torres Suárez José Antonio", "Toscano Rodríguez Pablo Eliel", "Trejo Santos Laura Enriqueta", "Trigo Lara Eduardo", "Urcid Flores Enrique", "Valderrama Velasco Celina", "Valdés Carrillo Arturo", "Valdés Pineda Jorge Oliver", "Valerio Vázquez Rafael", "Vallecillo Velázquez Hernán", "Vargas García Efraín Antonio", "Vargas Lucio Miguel", "Vargas Martínez Juan Miguel", "Vargas Martínez Raúl Enrique", "Vargas Salgado Elizabeth", "Vargas Sánchez Santos", "Vásquez Montero Roberto", "Vásquez Robles Abraham Enrique", "Vásquez Sánchez Enrique", "Vázquez Barrientos Juan Carlos", "Vázquez de Jesús Rafael", "Vázquez de la Garza Juan José", "Vázquez Sánchez David", "Velázquez Medina Francisco Xavier", "Vega Herrera Amado Sergio", "Vélez Salas José Luis", "Vera Nava Marco Alejandro", "Vera Sánchez María Guadalupe", "Vergara Díaz Elisa", "Vergara Laguna Carlos M.", "Vergara Rodríguez José", "Victoria de la Rosa Víctor", "Villafán Iván", "Villanueva López Isaí", "Villarce Cruz Jesús", "Villareal Bayona Benjamín", "Villaseñor Herrero Alfonso", "Villegas Meza Pablo", "Vivanco Castillo José Miguel", "Vizcarra Jesús", "Yazbard Buzo Antonio", "Zamítiz Delgadillo José Nemesio", "Zarco Cosgalla Jesús", "Zepeda Valle Adrián Antonio" }));

        btnEditar.setText("Editar Paciente Existente");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        checkFact.setText("Factura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkFact, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(33, 33, 33))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(85, 85, 85)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(13, 13, 13)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre)
                            .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMotivo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHabitacion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExpediente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxMedico, javax.swing.GroupLayout.Alignment.LEADING, 0, 320, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnAceptarNP)
                                .addGap(52, 52, 52)
                                .addComponent(btnCancelarNP)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnEditar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(boxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(checkFact)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarNP)
                    .addComponent(btnCancelarNP))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnAceptarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarNPActionPerformed
 
        crearPaciente();   
             
    }//GEN-LAST:event_btnAceptarNPActionPerformed

    private void btnCancelarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNPActionPerformed
        // TODO add your handling code here:
        this.dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_btnCancelarNPActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        EditarPaciente ep = new EditarPaciente();
        ep.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed
    
    /**
     * This method is called from within btnAceptarNPActionPerformed
     * It tries to get all the info, if one is empty it throws a message
     * calls checkName
     * then it tries to insert all the info to the database
     * goes back to pag principal
     */
    
    public void crearPaciente() {
        try {
            //read inputs
            String nombre = txtNombre.getText();
            String exp = txtExpediente.getText();
            String fecha = txtFecha.getText();
            String sexo = txtSexo.getText().toUpperCase();
            int edad = Integer.parseInt(txtEdad.getText());
            String motivo = txtMotivo.getText();
            String habitacion = txtHabitacion.getText();
            String doc = boxMedico.getSelectedItem().toString();
            
            nombre = checkName(nombre);
            
            
            try {
            // add to DB
            pst = conn.getConnection().prepareStatement("insert into Paciente(nombre,expediente,ingreso,sexo,edad,diagnosticoIngreso,habitacion,medico)values(?,?,?,?,?,?,?,?)");
            pst.setString(1,nombre);
            pst.setString(2, exp);
            pst.setString(3, fecha);
            pst.setString(4,sexo);
            pst.setInt(5, edad); 
            pst.setString(6,motivo);
            pst.setString(7,habitacion);
            pst.setString(8, doc);
            pst.executeUpdate();
            
            //queries that set cuenta real, paquete and diferencia to 0.00
            
            pst = conn.getConnection().prepareStatement("UPDATE `Paciente` SET `Paciente`.`cuenta real` = 0.00 WHERE `Paciente`.`cuenta real` IS NULL ");
            pst.executeUpdate();
            pst = conn.getConnection().prepareStatement("UPDATE `Paciente` SET `Paciente`.`paquete` = 0.00 WHERE `Paciente`.`paquete` IS NULL ");
            pst.executeUpdate();
            pst = conn.getConnection().prepareStatement("UPDATE `Paciente` SET `Paciente`.`diferencia` = 0.00 WHERE `Paciente`.`diferencia` IS NULL ");
            pst.executeUpdate();
            
            //set estatus to ingreso
            pst = conn.getConnection().prepareStatement("UPDATE `Paciente` SET `Paciente`.`estatus` = 'ingreso' WHERE `Paciente`.`nombre` =? ");
            pst.setString(1, nombre);
            pst.executeUpdate();
            
            //factura si o no
            if(checkFact.isSelected()) {              
                pst = conn.getConnection().prepareStatement("UPDATE `Paciente` SET requiereFact = ? where nombre = ?");
                pst.setString(1, "si");
                pst.setString(2, nombre);
                pst.executeUpdate();
            } else {
                pst = conn.getConnection().prepareStatement("UPDATE `Paciente` SET requiereFact = ? where nombre = ?");
                pst.setString(1, "no");
                pst.setString(2, nombre);
                pst.executeUpdate();
            }
            
            JOptionPane.showMessageDialog(this, "Paciente agregado exitosamente");
            
            //reset and exit
            txtNombre.setText("");
            txtExpediente.setText("");
            txtFecha.setText("");
            txtSexo.setText("");
            txtEdad.setText("");
            txtMotivo.setText("");
            txtHabitacion.setText("");
            boxMedico.setSelectedIndex(-1);
            txtNombre.requestFocus();
            
            this.dispose(); 
            principal.setVisible(true);
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(NuevoPaciente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Paciente NO agregado");
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this,"Uno o mas campos esta vacio, intente de nuevo");
        }
        
        
    }
    

    public String checkName(String name) {
        int count = 2;
        String nombre = name;
        try {           
            pst = conn.getConnection().prepareStatement("SELECT COUNT(*) AS count FROM `Paciente` WHERE `nombre` = ?");
            pst.setString(1, nombre);
            rs = pst.executeQuery();
                      
            if (rs.next()) {
                int rowCount = rs.getInt("count");
                if (rowCount > 0) {
                    // Modify the value by adding a number suffix
                    while (true) {
                        nombre += " (" + count + ")";
                        pst = conn.getConnection().prepareStatement("SELECT COUNT(*) AS count FROM `Paciente` WHERE `nombre` = ?");
                        pst.setString(1, nombre);
                        rs = pst.executeQuery();
                        if (rs.next()) {
                            rowCount = rs.getInt("count");
                            if (rowCount == 0) {
                                // Found a unique value, break the loop
                                break;
                            }
                        }
                        count++;
                    }
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NuevoPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nombre;
    } 
    
    public void setDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Get today's date
        LocalDate currentDate = LocalDate.now();

        // Format the date as a string
        String formattedDate = currentDate.format(formatter);

        
        txtFecha.setText(formattedDate);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxMedico;
    private javax.swing.JButton btnAceptarNP;
    private javax.swing.JButton btnCancelarNP;
    private javax.swing.JButton btnEditar;
    private javax.swing.JCheckBox checkFact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtExpediente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
