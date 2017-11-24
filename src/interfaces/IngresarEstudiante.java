package interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import coneccion.Conexion;

/**
 *
 * @author danna
 */
public class IngresarEstudiante extends javax.swing.JFrame {
 public int resp;
 public int resp2;
    public IngresarEstudiante() {
        initComponents();
        setLocationRelativeTo(null);//Centrar Ventana
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nocarnet = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_dir = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        list_departamento = new javax.swing.JComboBox<>();
        txt_pasat = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        list_municipio = new javax.swing.JComboBox<>();
        list_sexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_contraseña_estudiante = new javax.swing.JTextField();
        txt_usuario_estudiante = new javax.swing.JTextField();
        txt_codigo_estudiante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("INGRESAR ESTUDIANTE");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 21, 219, 27));

        jLabel5.setText("NO. CARNET");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 70, -1, -1));
        jPanel3.add(txt_nocarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 66, 327, -1));
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 108, 327, -1));

        jLabel7.setText("NOMBRES:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 112, -1, -1));

        jLabel8.setText("APELLIDOS:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 154, -1, -1));

        jLabel9.setText("DIRECCIÓN:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 199, -1, -1));
        jPanel3.add(txt_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 195, 327, -1));
        jPanel3.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 150, 327, -1));
        jPanel3.add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 237, 327, -1));
        jPanel3.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 279, 327, -1));

        jLabel10.setText("TELÉFONO:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 241, -1, -1));

        jLabel11.setText("EMAIL:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 279, -1, -1));

        jLabel13.setText("SEXO:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 321, -1, -1));

        jLabel14.setText("PASA TIEMPO:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 367, -1, -1));

        jLabel15.setText("DEPARTAMENTO:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 405, -1, -1));

        list_departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Antioquia", "Arauca", "Atlántico", "Bolívar", "Boyacá", "Caldas", "Caquetá", "Casanare", "Cauca", "Cesar", "Córdoba", "Chocó", "Cundinamarca", "Guainía", "Guaviare", "Huila", "La Guajira", "Magdalena", "Meta", "Nariño", "Norte de Santander", "Putumayo", "Quindío", "Risaralda", "San Andrés", "Santander", "Sucre", "Tolima", "Valle del Cauca", "Vaupés", "Vichada" }));
        jPanel3.add(list_departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 405, 327, -1));
        jPanel3.add(txt_pasat, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 363, 327, -1));

        jLabel16.setText("MUNICIPIO:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 451, -1, -1));

        list_municipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abejorral", "Abriaqui", "Alejandría", "Amagá", "Amalfi", "Andes", "Angelópolis", "Angostura", "Anorí", "Antioquia", "Anzá", "Apartadó", "Arboletes", "Argelia", "Armenia", "Barbosa", "Belmira", "Bello", "Betania", "Betulia", "Bolívar", "Briseño", "Buriticá", "Cáceres", "Caicedo", "Caldas", "Campamento", "Cañasgordas", "Caracolí", "Caramanta", "Carepa", "Carmen de Viboral", "Carolina", "Caucasia", "Chigorodó", "Cisneros", "Cocorná", "Concepción", "Concordia", "Copacabana", "Dabeiba", "Don Matías", "Ebéjico", "El Bagre", "Entrerríos", "Envigado", "Fredonia", "Frontino", "Giraldo", "Girardota", "Gómez Plata", "Granada", "Guadalupe", "Guarne", "Guatapé", "Heliconia", "Hispania", "Itagüí", "Ituango", "Jardín", "Jericó", ">La Ceja", "376", "La Estrella", "La Pintada", "La Unión", "Liborina", "Maceo", "Marinilla", "Montebello", "Murindó", "Mutatá", "Nariño", "Necoclí", "Nechí", "Olaya", "Peñol", "Peque", "Pueblorrico", "Puerto Berrío", "Puerto Nare", "Puerto Triunfo", "Remedios", "Retiro", "Rionegro", "Sabanalarga", "Sabaneta", "Salgar", "San Andrés", "San Carlos", "San francisco", "San Jerónimo", "San José de Montaña", "San Juan de Urabá", "San Luis", "San Pedro", "San Pedro de Urabá", "San Rafael", "San Roque", "San Vicente", "Santa Bárbara", "Santa Rosa de Osos", "Santo Domingo", "Santuario", "Segovia", "Sonsón", "Sopetrán", "Támesis", "Tarazá", "Tarso", "Titiribí", "Toledo", "Turbo", "Uramita", "Urrao", "Valdivia", "Valparaíso", "Vegachí", "Venecia", "Vigía del Fuerte", "Yalí", "Yarumal", "Yolombó", "Yondó (Casabe)", "Zaragoza 895", "Arauca", "Arauquita", "Cravo Norte", "Fortul", "Puerto Rondón", "Fortul", "Puerto Rondón", "Saravena", "Tame", "Barranquilla", "Baranoa", "Campo de la Cruz", "Candelaria", "Galapa", "Juan de Acosta", "Luruaco", "Malambo", "Manatí", "Palmar de Varela", "Piojó", "Polonuevo", "Ponedera", "Puerto Colombia", "Repelón", "Sabanagrande", "Sabanalarga", "Santa Lucía", "Santo Tomás", "Soledad", "Suán", "Tubará", "Usiacurí", "Cartagena", "Achí", "Altos del Rosario", "Arenal", "Arjona", "Arroyohondo", "Barranco de Loba", "Calamar", "Cantagallo", "Cicuto", "Córdoba", "Clemencia", "El Carmen de Bolívar", "El Guamo", "El Peñón", "Hatillo de Loba", "Magangue", "Mahates", "Margarita", "María la Baja", "Montecristo", "Mompós", "Morales", "Pinillos", "Regidor", "Río Viejo", "San Cristóbal", "San Estanislao", "San Fernando", "San Jacinto", "San Jacinto del Cauca", "San Juan Nepomuceno", "San Martín de Loba", "San Pablo", "Santa Catalina", "Santa Rosa", "Santa Rosa del Sur", "Simití", "Soplaviento", "Talaigua Nuevo", "Tiquisio (Puerto Rico)", "Turbaco", "Turbaná", "Villanueva", "Zambrano", "Tunja", "Almeida", "Aquitania", "Arcabuco", "Belén", "Berbeo", "Beteitiva", "Boavita", "Boyacá", "Briseño", "Buenavista", "Busbanzá", "Caldas", "Campohermoso", "Cerinza", "Chinavita", "Chiquinquirá", "Chiscas", "Chita", "Chitaranque", "Chivatá", "Ciénaga", "Cómbita", "Coper", "Corrales", "Covarachia", "Cubar", "Cucaita", "Cuitiva", "Chíquiza", "Chivor", "Duitama", "El Cocuy", "El Espino", "Firavitoba", "Floresta", "Gachantivá", "Gámeza", "Garagoa", "Guacamayas", "Guateque", "Guayatá", "Guicán", "Iza", "Jenesano", "Jericó", "Labranzagrande", "La Capilla", "La Victoria", "La Ubita", "Villa de Leyva", "Macanal", "Maripí", "Miraflores", "Mongua", "Monguí", "Moniquirá", "Medellín", "Motavita", "Muzo", "Nobsa", "Nuevo Colón", "Oicatá", "Otanche", "Pachavita", "Páez", "Paipa", "Pajarito", "Panqueba", "Pauna", "Paya", "Paz de Río", "Pesca", "Pisva", "Puerto Boyacá", "Quípama", "Ramiquirí", "Ráquira", "Rondón", "Saboyá", "Sáchica", "Samacá", "San Eduardo", "San José de Pare", "San Luis de Gaceno", "San Mateo", "San Miguel de Sema", "San Pablo de Borbur", "Santana", "Santa María", "Santa Rosa de Viterbo", "Santa Sofía", "Sativanorte", "Sativasur", "Siachoque", "Soatá", "Socotá", "Socha", "Sogamoso", "Somondoco", "Sora", "Sotaquirá", "Soracá", "Susacón", "Sutamarchán", "Sutatenza", "Tasco", "Tenza", "Tibaná", "Tibasosa", "Tinjacá", "Tipacoque", "Toca", "Toguí", "Tópaga", "Tota", "Tunungua", "Turmequé", "Tuta", "Tutazá", "Úmbita", "Ventaquemada", "Viracachá", "Zetaquirá", "Manizales", "Aguadas", "Anserma", "Aranzazu", "Belalcázar", "Chinchina", "Filadelfia", "La Dorada", "La Merced", "Manzanares", "Marmato", "Marquetalia", "Marulanda", "Neira", "Pácora", "Palestina", "Pensilvania", "Riosucio", "Risaralda", "Salamina", "Samaná", "San José", "Supía", "Victoria", "Villamaría", "Viterbo", "Caquetá 18 Florencia", "Albania", "Belén de los Andaquíes", "Cartagena del Chairá", "Curillo", "El Doncello", "El Paujil", "La Montañita", "Milán", "Morelia", "Puerto Rico", "San José del Fragua", "San Vicente del Caguán", "Solano", "Solita", "Valparaíso", "Yopal", "Aguazul", "Chameza", "Hato Corozal", "La Salina", "Maní", "Monterrey", "Nunchía", "Orocué", "Paz de Ariporo", "Pore", "Recetor", "Sabalarga", "Sácama", "San Luis de Palenque", "Támara", "Tauramena", "Trinidad", "Villanueva", "Popayán", "Almaguer", "Argelia", "Balboa", "Bolívar", "Buenos Aires", "Cajibío", "Caldono", "Caloto", "Corinto", "El Tambo", "Florencia", "Guapi", "Inzá", "Jambaló", "La Sierra", "La Vega", "López (Micay)", "Mercaderes", "Miranda", "Morales", "Padilla", "Páez (Belalcazar)", "Patía (El Bordo)", "Piamonte", "Piendamó", "Puerto Tejada", "Puracé (Coconuco)", "Rosas", "San Sebastián", "Santander de Quilichao", "Santa Rosa", "Silvia", "Sotará (Paispamba)", "Suárez", "Timbío", "Timbiquí", "Toribío", "Totoro", "Valledupar", "Aguachica", "Agustín Codazzi", "Astrea", "Becerril", "Bosconia", "Chimichagua", "Chiriguaná", "Curumaní", "El Copey", "El Paso", "Gamarra", "González", "La Gloria", "La Jagua de Ibirico", "Manaure Balcón Cesar", "Pailitas", "Pelaya", "Pueblo Bello", "Río de Oro", "La Paz (Robles)", "San Alberto", "San Diego", "San Martín", "Tamalameque", "Montería", "Ayapel", "Buenavista", "Canalete", "Cereté", "Chima", "Chinú", "Ciénaga de Oro", "Cotorra", "La Apartada (Frontera)", "Lorica", "Los Córdobas", "Momil", "Montelíbano", "Monitos", "Planeta Rica", "Pueblo Nuevo", "Puerto Escondido", "Puerto Libertador", "Purísima", "Sahagún", "San Andrés Sotavento", "San Antero", "San Bernardo del Viento", "San Carlos", "San Pelayo", "Tierralta", "Valencia", "Agua de Dios", "Albán", "Anapoima", "Anolaima", "Arbeláez", "Beltrán", "Bituima", "Bojacá", "Cabrera", "Cachipay", "Cajicá", "Caparrapí", "Cáqueza", "Carmen de Carupa", "Chaguaní", "Chía", "Chipaque", "Choachí", "Chocontá", "Cogua", "Cota", "Cucunubá", "El Colegio", "El Peñón", "El Rosal", "Facatativá", "Fómeque", "Fosca ", "Funza", "Fúquene", "Fusagasugá", "Gachalá", "Gachancipá", "Gachetá", "Gama", "Girardot", "Granada", "Guachetá", "Guaduas", "Guasca", "Guataquí", "Guatavita", "Guayabal de Síquima", "Guayabetal", "Gutiérrez", "Jerusalén", "Junín", "La Calera", "La Mesa", "La Palma", "La Peña", "La Vega", "Lenguazaque", "Machetá", "Madrid", "Manta", "Medina", "Mosquera", "Nariño", "Nemocón", "Nilo", "Nimaima", "Nocaima", "Venecia (Ospina Pérez)", "Pacho", "Paime", "Pandi", "Paratebueno", "Pasca", "Puerto Salgar", "Pulí", "Quebradanegra", "Quetame", "Quipile", "Rafael", "Ricaurte", "San Antonio de Tequendama", "San Bernardo", "San Cayetano", "San Francisco", "San Juan de Rioseco", "Sasaima", "Sesquilé", "Sibate", "Silvania", "Simijaca", "Soacha", "Sopó", "Subachoque", "Suesca", "Supatá", "Susa", "Sutatausa", "Tabio", "Tausa", "Tena", "Tenjo", "Tibacuy", "Tibiritá", "Tocaima", "Tocancipá", "Topaipí", "Ubalá", "Ubaque", "Ubaté", "Une", "Útica", "Vergara", "Vianí", "Villagómez", "Villapinzón", "Villeta", "Viotá", "Yacopí", "Zipacón", "Zipaquirá", "Quibdó", "Acandí", "Alto Baudó (Pie de Pato)", "Atrato (Yuto)", "Bagadó", "Bahía Solano (Mútis)", "Bajo Baudó (Pizarro)", "Bojayá (Bellavista)", "Cantón de San Pablo", "Condoto", "El Carmen", "El Litoral de San Juan", "Itsmina", "Juradó", "Lloró", "Nóvita", "Nuquí", "Riosucio", "San José del Palmar", "Sipí", "Tadó", "Unguía", "Guainía 94 Inírida", "Guaviare 95 San José del Guaviare", "Calamar", "El Retorno", "Miraflores", "Neiva", "Acevedo", "Agrado", "Aipe", "Algeciras", "Altamira", "Baraya", "Campoalegre", "Colombia", "Elías", "Garzón", "Gigante", "Guadalupe", "Hobo", "Iquira", "Isnos", "La Argentina", "La Plata", "Nátaga", "Oporapa", "Paicol", "Palermo", "Palestina", "Pital", "Pitalito", "Rivera", "Saladoblanco", "San Agustín", "Santa María", "Suazá", "Tarqui", "Tesalia", "Tello", "Teruel", "Timaná", "Villavieja", "Yaguará", "Riohacha", "Barrancas", "Dibulla", "Distracción", "El Molino", "Fonseca", "Hatonuevo", "Maicao", "Manaure", "San Juan del Cesar", "Uribía", "Urumita", "Villanueva", "Santa Marta", "Aracataca", "Ariguaní (El Difícil)", "Cerro San Antonio", "Chivolo", "Ciénaga", "El Banco", "El Piñón", "El Retén", "Fundación", "Guamal", "Pedraza", "Pijiño del Carmen", "Pivijay", "Plato", "Publoviejo", "Remolino", "Salamina", "San Sebastián de Buuenavista", "San Zenón", "Santa Ana", "Sitionuevo", "Tenerife", "Meta 50 Villavicencio", "Acacias", "Barranca de Upía", "Cabuyaro", "Castilla la Nueva", "Cubarral", "Cumaral", "El Calvario", "El Castillo", "El Dorado", "Fuente de Oro", "Granada", "Guamal", "Mapiripán", "Mesetas", "La Macarena", "La Uribe", "Lejanías", "Puerto Concordia", "Puerto Gaitán", "Puerto López", "Puerto Lleras", "Puerto Rico", "Restrepo", "San Carlos de Guaroa", "San Juan de Arama", "San Juanito", "San Martín", "Vistahermosa", "Pasto", "Albán (San José)", "Aldana", "Ancuyá", "Arboleda (Berruecos)", "Barbacoas", "Belén", "Buesaco", "Colón (Génova)", "Consacá", "Contadero", "Córdoba", "Cuaspud (Carlosama)", "Cumbal", "Cumbitará", "Chachagüi", "El Charco", "El Rosario", "El Tablón", "El Tambo", "Funes", "Guachucal", "Guaitarilla", "Gualmatán", "Iles", "Imúes", "Ipiales", "La Cruz", "La Florida", "La Llanada", "La Tola", "La Unión", "Leiva", "Linares", "Los Andes (Sotomayor)", "Magüí (Payán)", "Mallama (Piedrancha)", "Mosquera", "Olaya", "Ospina", "Francisco Pizarro", "Policarpa", "Potosí", "Providencia", "Puerres", "Pupiales", "Ricaurte", "Roberto Payán (San José)", "Samaniego", "Sandoná", "San Bernardo", "San Lorenzo", "San Pablo", "San Pedro de Cartago", "Santa Bárbara (Iscuandé)", "Santa Cruz (Guachávez)", "Sapuyés", "Taminango", "Tangua", "Tumaco", "Túquerres", "Yacuanquer", "Cúcuta", "Abrego", "Arboledas", "Bochalema", "Bucarasica", "Cácota", "Cáchira", "Chinácota", "Chitagá", "Convención", "Cucutilla", "Durania", "El Carmen", "El Tarra", "El Zulia", "Gramalote", "Hacarí", "Herrán", "Labateca", "La Esperanza", "La Playa", "Los Patios", "Lourdes", "Mutiscua", "Ocaña", "Pamplona", "Pamplonita", "Puerto Santander", "Ragonvalia", "Salazar", "San Calixto", "San Cayetano", "Santiago", "Sardinata", "Silos", "Teorama", "Tibú", "Toledo", "Villacaro", "Villa del Rosario", "Mocoa", "Colón", "Orito", "Puerto Asís", "Puerto Caicedo", "Puerto Guzmán", "Puerto Leguízamo", "Sibundoy", "San Francisco", "San Miguel", "Santiago", "Villa Gamuez (La Hormiga)", "Villa Garzón", "Quindío 63 Armenia", "Buenavista", "Calarcá", "Circasia", "Córdoba", "Filandia", "Génova", "La Tebaida", "Montenegro", "Pijao", "Quimbaya", "Salento", "Pereira", "Apía", "Balboa", "Belén de Umbría", "Dos Quebradas", "Guática", "La Celia", "La Virginia", "Marsella", "Mistrató", "Pueblo Rico", "Quinchia", "Santa Rosa de Cabal", "Santuario", "San Andrés", "Providencia", "Bucaramanga", "Aguada", "Albania", "Aratoca", "Barbosa", "Barichara", "Barrancabermeja", "Betulia", "Bolívar", "Cabrera", "California", "Capitanejo", "Carcasí", "Cepitá", "Cerrito", "Charalá", "Charta", "Chima", "Chipatá", "Cimitarra", "Concepción", "Confines", "Contratación", "Coromoro", "Curití", "El Carmen", "El Guacamayo", "El Peñón", "El Playón", "Encino", "Enciso", "Florián", "Floridablanca", "Galán", "Gámbita", "Girón", "Guaca", "Guadalupe", "Guapotá", "Guavata", "Guepsa", "Hato", "Jesús María", "Jordán", "La Belleza", "Landázuri", "La Paz", "Lebrija", "Los Santos", "Macaravita", "Málaga", "Matanza", "Mogotes", "Molagavita", "Ocamonte", "Oiba", "Onzága", "Palmar", "Palmas del Socorro", "Páramo", "Pie de Cuesta", "Pinchote", "Puente Nacional", "Puerto Parra", "Puerto Wilches", "Rionegro", "Sabana de Torres", "San Andrés", "San Benito", "San Gil", "San Joaquín", "San José de Miranda", "San Miguel", "San Vicente de Chucurí", "Santa Bárbara", "Santa Helena del Opón", "Simacota", "Socorro", "Suaita", "Sucre", "Suratá", "Tona", "Valle de San José", "Vélez", "Vetas", "Villanueva", "Zapatoca", "Sincelejo", "Buenavista", "Caimito", "Coloso (Ricaurte)", "Corozal", "Chalán", "Galeras (Nueva Granada)", "Guarandá", "La Unión", "Los Palmitos", "Majagual", "Morroa", "Ovejas", "Palmito", "Sampués", "San Benito Abad", "San Juan de Betulia", "San Marcos", "San Onofre", "San Pedro", "Sincé", "Sucre", "Tolú", "Toluviejo", "Ibagué", "Alpujarra", "Alvarado", "Ambalema", "Anzóategui", "Armero (Guayabal)", "Ataco", "Cajamarca", "Carmen de Apicalá", "Casabianca", "Chaparral", "Coello", "Coyaima", "Cunday", "Dolores", "Espinal", "Falán", "Flandes", "Fresno", "Guamo", "Herveo", "Honda", "Icononzo", "Lérida", "Líbano", "Mariquita", "Melgar", "Murillo", "Natagaima", "Ortega", "Palocabildo", "Piedras", "Planadas", "Prado", "Purificación", "Rioblanco", "Roncesvalles", "Rovira", "Saldaña", "San Antonio", "San Luis", "Santa Isabel", "Suárez", "Valle de San Juan", "Venadillo", "Villahermosa", "Villarrica", "Cali", "Alcalá", "Andalucía", "Ansermanuevo", "Argelia", "Bolívar", "Buenaventura", "Buga", "Bugalagrande", "Caicedonia", "Calima (Darién)", "Candelaria", "Cartago", "Dagua", "El Águila", "El Cairo", "El Cerrito", "El Dovio", "Florida", "Ginebra", "Guacarí", "Jamundí", "La Cumbre", "La Unión", "La Victoria", "Obando", "Palmira", "Pradera", "Restrepo", "Riofrío", "Roldanillo", "San Pedro", "Sevilla", "Toro", "Trujillo", "Tuluá", "Ulloa", "Versalles", "Vijes", "Yotoco", "Yumbo", "Zarzal", "Vaupés 97 Mitú", "Carurú", "Tatamá", "Vichada 99 Puerto Carreño", "La Primavera", "Santa Rosalia", "Cumaribo", " " }));
        jPanel3.add(list_municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 449, 327, -1));

        list_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer", "Otro" }));
        jPanel3.add(list_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 321, 327, -1));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, -1));

        jLabel3.setText("CODIGO:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, -1, -1));

        jLabel4.setText("USUARIO:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, -1));

        jLabel12.setText("CONTRASEÑA:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, -1, -1));
        jPanel3.add(txt_contraseña_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 268, -1));
        jPanel3.add(txt_usuario_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 267, -1));
        jPanel3.add(txt_codigo_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 267, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("DATOS LOGIN");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_atras.setText("ATRAS");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_atras)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        MenuAdmin ma = null;
     try {
         ma = new MenuAdmin();
     } catch (SQLException ex) {
         Logger.getLogger(IngresarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(IngresarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
     }
        ma.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        Conexion con = new Conexion();
        PreparedStatement ps;
        PreparedStatement ps2;
        try {
            Connection cn = con.conectar();
            ps = cn.prepareStatement("INSERT INTO estudiantes (es_NumCarnet, es_nombre, es_apellido, es_direccion, es_telefono, es_email, es_sexo, es_pasatiempo, es_departamento, es_municipio, es_codigo) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, txt_nocarnet.getText());
            ps.setString(2, txt_nombre.getText());
            ps.setString(3, txt_apellidos.getText());
            ps.setString(4, txt_dir.getText());
            ps.setString(5, txt_tel.getText());
            ps.setString(6, txt_email.getText());
            ps.setString(7, list_sexo.getSelectedItem().toString());
            ps.setString(8, txt_pasat.getText());
            ps.setString(9, list_departamento.getSelectedItem().toString());
            ps.setString(10, list_municipio.getSelectedItem().toString());
            ps.setString(11, txt_codigo_estudiante.getText());            
            ps2 = cn.prepareStatement("INSERT INTO usuarios (codigo, usuario, tipouser, password) VALUES(?,?,?,?)");
            ps2.setString(1, txt_codigo_estudiante.getText());
            ps2.setString(3, "2");
            ps2.setString(2, txt_usuario_estudiante.getText());
            ps2.setString(4, txt_contraseña_estudiante.getText());
            
            if ("".equals(txt_nocarnet.getText()) || "".equals(txt_nombre.getText()) || "".equals(txt_apellidos.getText()) || "".equals(txt_dir.getText()) || "".equals(txt_tel.getText()) || "".equals(txt_email.getText()) || "".equals(txt_pasat.getText()) || "".equals(txt_codigo_estudiante.getText()) || "".equals(txt_usuario_estudiante.getText()) || "".equals(txt_contraseña_estudiante.getText())) {
             JOptionPane.showMessageDialog(null, "Complete Todos Los Campos");
            } else{
                resp = ps.executeUpdate();
                resp2 = ps2.executeUpdate();
                limpiar();
            }
            if (resp > 0 && resp2 > 0) {
                JOptionPane.showMessageDialog(this, "Insertado!");
                limpiar();
            }
            if (resp < 0 && resp2 < 0){
                JOptionPane.showMessageDialog(this, "NO Insertado");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(IngresarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IngresarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
       limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed
    
    public void limpiar(){
        txt_nocarnet.setText("");
        txt_nombre.setText("");
        txt_apellidos.setText("");
        txt_dir.setText("");
        txt_tel.setText("");
        txt_email.setText("");
        txt_pasat.setText("");
        txt_tel.setText("");
        txt_codigo_estudiante.setText("");
        txt_usuario_estudiante.setText("");
        txt_contraseña_estudiante.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(IngresarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> list_departamento;
    private javax.swing.JComboBox<String> list_municipio;
    private javax.swing.JComboBox<String> list_sexo;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_codigo_estudiante;
    private javax.swing.JTextField txt_contraseña_estudiante;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nocarnet;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_pasat;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_usuario_estudiante;
    // End of variables declaration//GEN-END:variables
}
