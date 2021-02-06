/*
 software enfocado en el mejor desarrollo y manejo de un negocio farmaceutico
 */
package app;

//librerias necesarias para la conexion con la base de datos y el debido funcionamiento de las transacciones 
import app.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  Daniel Ramirez
 */
public class productos extends javax.swing.JFrame {

    //----------------
    //variables necesarias para el metodo de buscar;
    Connection cn = conexion.getConexion();
    DefaultTableModel model = new DefaultTableModel();  
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null; 
    //-----------------
    
    //constructor de formulario
    public productos() {
        initComponents();
        txt_codigo.setVisible(false);
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_productos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_laboratorio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_precioMayor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        txt_codigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_precioUnidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lavie Vital");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Medicamentos");

        tbl_productos.setBackground(new java.awt.Color(255, 255, 255));
        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Laboratorio", "fecha de vencimiento ", "cantidad", "precio x unidad", "precio x mayor", "descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_productos);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Laboratorio:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de venc:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Catidad:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Precio X mayor:");

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane2.setViewportView(txt_descripcion);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Descrpcion:");

        btn_guardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_limpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_modificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Precio X unidad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btn_guardar)
                .addGap(43, 43, 43)
                .addComponent(btn_modificar)
                .addGap(37, 37, 37)
                .addComponent(btn_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_limpiar)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txt_precioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_laboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(txt_precioMayor))))
                .addGap(50, 50, 50)
                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_laboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_precioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_precioMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_modificar))
                .addGap(21, 21, 21))
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Busqueda:");

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(315, 315, 315))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(17, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        //se crean variables que guarden la informacion en cada uno de los txt(imputs)
        String Nombre = txt_nombre.getText();
        String Laboratorio = txt_laboratorio.getText();
        String Fecha = txt_fecha.getText();
        int Cantidad = Integer.parseInt(txt_cantidad.getText());
        int precioU = Integer.parseInt(txt_precioUnidad.getText());
        int precioM = Integer.parseInt(txt_precioMayor.getText());
        String Descripcion = txt_descripcion.getText();
        
        
        //los try catch son para hacer transacciones.
        try {
            
            //accedo a conexion para enlasarme con la BD
             Connection con = conexion.getConexion();
             //instancion la linea de comando para insertar 
              PreparedStatement ps = con.prepareStatement("INSERT INTO productos (nombre, laboratorio, fecha, cantidad, precioU, precioM, descripcion) VALUES (?,?,?,?,?,?,?)");
              
              //se inserta en cada posicion de la base de datos 
            ps.setString(1, Nombre);
            ps.setString(2, Laboratorio);     
            ps.setString(3, Fecha);
            ps.setInt(4, Cantidad);
            ps.setInt(5, precioU);
            ps.setInt(6, precioM);
            ps.setString(7, Descripcion);
            //carga a la base de datos
            ps.executeUpdate();         
            JOptionPane.showMessageDialog(null,"Informacion Guardada");
            limpiar();
            cargarTabla();
            
        } catch (Exception e) {
            System.out.println("error");
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    //metodo para seleccionar filas al dar click
    private void tbl_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_productosMouseClicked
        try {
            
            //identifico la linea seleccionada en la tabla 
            int fila = tbl_productos.getSelectedRow();
            //accedo al codigo de esa linea seleccionada 
            int codigo = Integer.parseInt(tbl_productos.getValueAt(fila,0).toString());
            
            //variables necesarias para trabajar en conjunto con la BD
            PreparedStatement ps;
            ResultSet rs;
        
            
            Connection con = conexion.getConexion();
            //comando para seleccionar la linea que se busca en la BD
              ps = con.prepareStatement("SELECT nombre, laboratorio, fecha, cantidad, precioU, precioM, descripcion FROM productos WHERE codigo=?"); 
               
              //por medio del codigo se ubica
              ps.setInt(1, codigo);
              rs = ps.executeQuery();
              
              //utilizo un while para cargar toda la informacion a cada uno de los txt(imputs)
              while(rs.next()){
                  txt_codigo.setText(String.valueOf(codigo));
                  txt_nombre.setText(rs.getString("nombre"));
                  txt_laboratorio.setText(rs.getString("laboratorio"));
                  txt_fecha.setText(rs.getString("fecha"));
                  txt_cantidad.setText(rs.getString("cantidad"));
                  txt_precioUnidad.setText(rs.getString("precioU"));
                  txt_precioMayor.setText(rs.getString("precioM"));
                  txt_descripcion.setText(rs.getString("descripcion"));
                  //el getString esta obteniendo la informacion de cada columna en la BD
              }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tbl_productosMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
       
        //guardo en cada variable la nueva informacion que se actaulizo 
        int codigo = Integer.parseInt(txt_codigo.getText());
        String Nombre = txt_nombre.getText();
        String Laboratorio = txt_laboratorio.getText();
        String Fecha = txt_fecha.getText();
        int Cantidad = Integer.parseInt(txt_cantidad.getText());
        int precioU = Integer.parseInt(txt_precioUnidad.getText());
        int precioM = Integer.parseInt(txt_precioMayor.getText());
        String Descripcion = txt_descripcion.getText();
        
        
        //los try catch son para hacer transacciones.
        try {
            //me conecto con la BD y actualizo en ella 
             Connection con = conexion.getConexion();
              PreparedStatement ps = con.prepareStatement("UPDATE productos SET nombre=?, laboratorio=?, fecha=?, cantidad=?, precioU=?, precioM=?, descripcion=? WHERE codigo=?");
              
            ps.setString(1, Nombre);
            ps.setString(2, Laboratorio);     
            ps.setString(3, Fecha);
            ps.setInt(4, Cantidad);
            ps.setInt(5, precioU);
            ps.setInt(6, precioM);
            ps.setString(7, Descripcion);
             ps.setInt(8, codigo);
            ps.executeUpdate();         
            JOptionPane.showMessageDialog(null,"Registro Modificada");
            limpiar();
            cargarTabla();
            
        } catch (Exception e) {
            System.out.println("error");
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        //mediante el codigo indentifico la linea a eliminar 
        int codigo = Integer.parseInt(txt_codigo.getText());

        //los try catch son para hacer transacciones.
        try {
            
             Connection con = conexion.getConexion();
              PreparedStatement ps = con.prepareStatement("DELETE FROM productos  WHERE codigo=?");    
              //el signo de pregunta hace referencia a esta linea de abajo 
              ps.setInt(1, codigo);
            ps.executeUpdate();         
            JOptionPane.showMessageDialog(null,"Registro Eliminado");
            limpiar();
            cargarTabla();
            
        } catch (Exception e) {
            System.out.println("error");
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    
    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
         //array para guardar cada uno de los titulos que se encuentran en la tabla 
        String[] titulos = {"Codigo", "Nombre", "laboratorio", "fecha de vencimiento", "cantidad", "precio x unidad", "precio x mayor", "descripcion"};
        
        //es necesario crear un array de registros para almacenar lo encontrado en la consulta y despues imprimir este.
        String[] registros = new String[200];
        //comando que busca por el nombre del medicamento en sql
        String sql = "SELECT * FROM productos WHERE nombre LIKE '%" + txt_buscar.getText() + "%' ";
        model = new DefaultTableModel(null, titulos);
        Connection conect = conexion.getConexion();
        try
        {
            st = (Statement) conect.createStatement();
            rs = st.executeQuery(sql);
        //guardamos en el array cada uno de los campos en su respectiva posicion y al final se agrega como una fila en la tabla
            while (rs.next())
            {
                registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("laboratorio");
                registros[3] = rs.getString("fecha");
                registros[4] = rs.getString("cantidad");
                registros[5] = rs.getString("precioU");
                registros[6] = rs.getString("precioM");
                registros[7] = rs.getString("descripcion");
                model.addRow(registros);
            }
            tbl_productos.setModel(model);
        } catch (SQLException ex)
        {
            System.out.println("ERROR AL BUSCAR LOS DATOS :( " + ex.getMessage());
        }
    }//GEN-LAST:event_txt_buscarKeyPressed
private void limpiar(){
    //se setea cada uno de los txt con comillas dobles vacias.
    txt_nombre.setText("");
    txt_laboratorio.setText("");
    txt_fecha.setText("");
    txt_cantidad.setText("");
    txt_precioUnidad.setText("");
    txt_precioMayor.setText("");
    txt_descripcion.setText("");
    
}
//este metodo permite que la informacion de la base de datos quede en la tabla 
    private void cargarTabla(){ 
        DefaultTableModel modeloTabla = (DefaultTableModel) tbl_productos.getModel();
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        //array que permite establecer el tamaño de cada una de las columnas de la tabla 
        int[] anchos = {30,60,60,70,20,60,60,150};
        for (int i = 0; i < tbl_productos.getColumnCount(); i++) {
            tbl_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        
        try {
            Connection con = conexion.getConexion();
               ps = con.prepareStatement("SELECT codigo,nombre, laboratorio, fecha,cantidad, precioU, precioM, descripcion FROM productos"); 
               
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public static void main(String args[]) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_productos;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_laboratorio;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precioMayor;
    private javax.swing.JTextField txt_precioUnidad;
    // End of variables declaration//GEN-END:variables
}
