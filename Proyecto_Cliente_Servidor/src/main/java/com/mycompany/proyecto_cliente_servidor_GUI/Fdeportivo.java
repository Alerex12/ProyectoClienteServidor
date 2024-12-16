/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_cliente_servidor_GUI;

import com.mycompany.proyecto_cliente_servidor.Cliente;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author aleja
 */
public class Fdeportivo extends javax.swing.JFrame {
    private Cliente cliente;
    private Socket socket;
    private ObjectOutputStream output;
    private ObjectInputStream input;
  
    public Fdeportivo() {
        initComponents();
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
        idtxt = new javax.swing.JLabel();
        eq1txt = new javax.swing.JLabel();
        eq2txt = new javax.swing.JLabel();
        torneotxt = new javax.swing.JLabel();
        nombretxt = new javax.swing.JLabel();
        ticketstxt = new javax.swing.JLabel();
        javax.swing.JLabel fechatxt = new javax.swing.JLabel();
        lugartxt = new javax.swing.JLabel();
        organizadortxt = new javax.swing.JLabel();
        entradaID = new javax.swing.JTextField();
        entradaEq1 = new javax.swing.JTextField();
        entradaEq2 = new javax.swing.JTextField();
        entradaTorneo = new javax.swing.JTextField();
        entradaNombre = new javax.swing.JTextField();
        entradatickets = new javax.swing.JTextField();
        entradaFecha = new javax.swing.JTextField();
        entradalugar = new javax.swing.JTextField();
        entradaOrganizador = new javax.swing.JTextField();
        agregarBoton = new javax.swing.JButton();
        editarBoton = new javax.swing.JButton();
        eliminarBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Menú Eventos deportivos");

        idtxt.setText("ID");

        eq1txt.setText("Equipo 1");

        eq2txt.setText("Equipo 2");

        torneotxt.setText("Torneo");

        nombretxt.setText("Nombre");

        ticketstxt.setText("Tickets");

        fechatxt.setText("Fecha");

        lugartxt.setText("Lugar");

        organizadortxt.setText("Organizador");

        agregarBoton.setText("Agregar");

        editarBoton.setText("Editar");

        eliminarBoton.setText("Eliminar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Equipo 1", "Equipo 2", "Torneo", "Nombre", "Tickets", "Fecha", "Lugar", "Organizador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(agregarBoton)
                            .addGap(82, 82, 82)
                            .addComponent(editarBoton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                            .addComponent(eliminarBoton))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idtxt)
                                .addComponent(eq1txt)
                                .addComponent(eq2txt)
                                .addComponent(torneotxt)
                                .addComponent(nombretxt)
                                .addComponent(ticketstxt)
                                .addComponent(fechatxt)
                                .addComponent(lugartxt)
                                .addComponent(organizadortxt))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(entradaID)
                                .addComponent(entradaEq1)
                                .addComponent(entradaEq2)
                                .addComponent(entradaTorneo)
                                .addComponent(entradaNombre)
                                .addComponent(entradatickets)
                                .addComponent(entradaFecha)
                                .addComponent(entradalugar)
                                .addComponent(entradaOrganizador, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                            .addGap(8, 8, 8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idtxt)
                    .addComponent(entradaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eq1txt)
                    .addComponent(entradaEq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eq2txt)
                    .addComponent(entradaEq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(torneotxt)
                    .addComponent(entradaTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombretxt)
                    .addComponent(entradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketstxt)
                    .addComponent(entradatickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechatxt)
                    .addComponent(entradaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lugartxt)
                    .addComponent(entradalugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizadortxt)
                    .addComponent(entradaOrganizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarBoton)
                    .addComponent(editarBoton)
                    .addComponent(eliminarBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBoton;
    private javax.swing.JButton editarBoton;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JTextField entradaEq1;
    private javax.swing.JTextField entradaEq2;
    private javax.swing.JTextField entradaFecha;
    private javax.swing.JTextField entradaID;
    private javax.swing.JTextField entradaNombre;
    private javax.swing.JTextField entradaOrganizador;
    private javax.swing.JTextField entradaTorneo;
    private javax.swing.JTextField entradalugar;
    private javax.swing.JTextField entradatickets;
    private javax.swing.JLabel eq1txt;
    private javax.swing.JLabel eq2txt;
    private javax.swing.JLabel idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lugartxt;
    private javax.swing.JLabel nombretxt;
    private javax.swing.JLabel organizadortxt;
    private javax.swing.JLabel ticketstxt;
    private javax.swing.JLabel torneotxt;
    // End of variables declaration//GEN-END:variables
}
