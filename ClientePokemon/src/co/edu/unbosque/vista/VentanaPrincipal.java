package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class VentanaPrincipal extends JFrame{
	
	private JFrame ventana1;
	private JLabel titulo;
	private JLabel buscar;
	private JLabel nombre;
	private JLabel mote;
	private JLabel nivel;
	private JLabel ataques;
	private JTextField nombre1;
	private JTextField mote1;
	private JTextField nivel1;
	private JTextField ataques1;
	private JButton agregar;
	private JButton mostrar_todo;
	private JButton buscar_por_nombre;

	 
	public VentanaPrincipal() {
		init();
		
	}
	
	public void init() {
		setSize(650,610);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle("Pokemon");
		JLabel fondo = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/imagen1.jpeg")).getImage().getScaledInstance(670, 646, Image.SCALE_SMOOTH)));
	    setContentPane(fondo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		titulo= new JLabel("Bienvenido");
		titulo.setBounds(200,-137,400,400);
		titulo.setForeground(Color.black);
		titulo.setFont(new Font("Bookman Old Style", Font.ITALIC, 48));
		
		JLabel titulo2= new JLabel("Entrenador Pokemon");
		titulo2.setBounds(170,-97,400,400);
		titulo2.setForeground(Color.black);
		titulo2.setFont(new Font("Bradley Hand ITC", Font.ITALIC, 36));
		
		Font fuente = new Font("Bookman Old Style", Font.ITALIC, 20);
		Font fuente2= new Font("Bradley Hand ITC", 1, 15);
		
		
		agregar= new JButton("Agregar");
		agregar.setBounds(120, 250, 150, 50);
		agregar.setFocusable(false);
		agregar.setBackground(Color.gray);
		agregar.setForeground(Color.white);
		agregar.setFont(fuente);
		
		mostrar_todo= new JButton("Mostrar todo");
		mostrar_todo.setBounds(210, 330, 220, 50);
		mostrar_todo.setFocusable(false);
		mostrar_todo.setBackground(Color.gray);
		mostrar_todo.setForeground(Color.white);
		mostrar_todo.setFont(fuente);
		
		
		buscar_por_nombre= new JButton("Buscar");
		buscar_por_nombre.setBounds(357, 250, 150, 50);
		buscar_por_nombre.setFocusable(false);
		buscar_por_nombre.setBackground(Color.gray);
		buscar_por_nombre.setForeground(Color.white);
		buscar_por_nombre.setFont(fuente);
	
		add(titulo);
		add(titulo2);
		add(mostrar_todo);
		add(agregar);
		add(buscar_por_nombre);
	}
	
	public String leerDato(String mensaje, String titulo) {
		String datos= JOptionPane.showInputDialog(null,mensaje, titulo, 3);
		return datos;
	}
	
	public void mostrarInfo(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, 1);
	}
	
	

	public JLabel getMote() {
		return mote;
	}

	public void setMote(JLabel mote) {
		this.mote = mote;
	}

	public JLabel getNivel() {
		return nivel;
	}

	public void setNivel(JLabel nivel) {
		this.nivel = nivel;
	}

	public JLabel getAtaques() {
		return ataques;
	}

	public void setAtaques(JLabel ataques) {
		this.ataques = ataques;
	}

	public JTextField getMote1() {
		return mote1;
	}

	public void setMote1(JTextField mote1) {
		this.mote1 = mote1;
	}

	public JTextField getNivel1() {
		return nivel1;
	}

	public void setNivel1(JTextField nivel1) {
		this.nivel1 = nivel1;
	}

	public JTextField getAtaques1() {
		return ataques1;
	}

	public void setAtaques1(JTextField ataques1) {
		this.ataques1 = ataques1;
	}

	public void setBuscar_por_nombre(JButton buscar_por_nombre) {
		this.buscar_por_nombre = buscar_por_nombre;
	}

	public JFrame getVentana1() {
		return ventana1;
	}

	public void setVentana1(JFrame ventana1) {
		this.ventana1 = ventana1;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getBuscar() {
		return buscar;
	}

	public void setBuscar(JLabel buscar) {
		this.buscar = buscar;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}



	public JTextField getNombre1() {
		return nombre1;
	}

	public void setNombre1(JTextField nombre1) {
		this.nombre1 = nombre1;
	}


	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JButton getMostrar_todo() {
		return mostrar_todo;
	}

	public void setMostrar_todo(JButton mostrar_todo) {
		this.mostrar_todo = mostrar_todo;
	}

	public JButton getBuscar_por_nombre() {
		return buscar_por_nombre;
	}

	public void setBuscar_por_cedula(JButton buscar_por_nombre) {
		this.buscar_por_nombre = buscar_por_nombre;
	}

	

	
	

}
