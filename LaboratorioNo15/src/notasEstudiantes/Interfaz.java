/*
	 * Programa: Clase que contiene la interfaz del programa para ingresar las notas de estudiantes
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  31 de enero de 2021.
*/
package notasEstudiantes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtApe;
	private JTextField txtCod;
	private JTextField txtPar1;
	private JTextField txtPar2;
	private JTextField txtExa;
	// Se crea un ArrayList de objetos Estudiante
	private ArrayList<Estudiante> Lis;
	private JTable TablaEstudiantes;
	JLabel lblPromedio = new JLabel("El promedio de las notas definitivas es: ");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	// Metodo que limpia los campos de texto que el usuario ingresa
	public void LimpiarCampos() {
		txtNom.setText("");
		txtApe.setText("");
		txtCod.setText("");
		txtPar1.setText("");
		txtPar2.setText("");
		txtExa.setText("");

	}

//Metodo que ingresa los datos del arraylist en la tabla
	public void DatosTabla() {
		String mat[][] = new String[Lis.size()][7];
		Estudiante aux;
		double promDef = 0;
		for (int i = 0; i < Lis.size(); i++) {
			aux = Lis.get(i);
			mat[i][0] = Integer.toString(aux.getCodigo());
			mat[i][1] = aux.getApellido();
			mat[i][2] = aux.getNombre();
			mat[i][3] = Integer.toString(aux.getPar1());
			mat[i][4] = Integer.toString(aux.getPar2());
			mat[i][5] = Integer.toString(aux.getExa());

			mat[i][6] = Double.toString(aux.getDef());
			promDef = promDef + aux.getDef();

		}
		TablaEstudiantes.setModel(new DefaultTableModel(mat, new String[] { "Codigo", "Apellido", "Nombre",
				"Parcial 1 (35%)", "Parcial 2 (35%)", "Examen (30%)", "Definitiva" }));
		promDef = promDef / Lis.size();
		promDef = Math.round(promDef * 100.0) / 100.0;
		lblPromedio.setText("El promedio de las notas definitvas es: " + promDef);

	}

	// Metodo que carga los datos del archivo
	public void cargar() {
		File archivo = new File("src\\ficheros\\Estudiantes.txt");
		FileReader leer;
		BufferedReader Almacen;
		Estudiante per, aux = new Estudiante();
		try {
			leer = new FileReader(archivo);
			Almacen = new BufferedReader(leer);
			per = aux.cargar(Almacen);
			while (per != null) {
				Lis.add(per);
				per = aux.cargar(Almacen);
			}
			Almacen.close();
			leer.close();
		} catch (Exception e) {

		}
		DatosTabla();
	}

	public Interfaz() {// Constructor de la clase en la cual estara la funcionalidad del programa

		Lis = new ArrayList<Estudiante>();// Se instancia un arrayList de objetos

		setTitle("Ingresar Notas Estudiantes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// JLabels
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(52, 38, 46, 14);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(52, 75, 46, 14);
		contentPane.add(lblApellido);

		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(52, 112, 46, 14);
		contentPane.add(lblCodigo);

		JLabel lblParcial1 = new JLabel("Parcial 1 (35%)");
		lblParcial1.setBounds(52, 137, 93, 14);
		contentPane.add(lblParcial1);

		JLabel lblParcial2 = new JLabel("Parcial 2 (35%)");
		lblParcial2.setBounds(52, 162, 93, 14);
		contentPane.add(lblParcial2);

		JLabel lblExamenFinal = new JLabel("Examen Final (30%)");
		lblExamenFinal.setBounds(52, 187, 123, 14);
		contentPane.add(lblExamenFinal);

		txtNom = new JTextField();// Campo de texto del nombre
		txtNom.setBounds(218, 35, 140, 20);
		txtNom.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				char d;
				d = Character.toLowerCase(c);
				if ((d < 'a' || d > 'z')) {
					if (d == ' ') {// Se consume sino son letras
					} else {
						e.consume();
					}

				}

			}
		});
		contentPane.add(txtNom);
		txtNom.setColumns(10);

		txtApe = new JTextField();// Campo de texto del apellido
		txtApe.setBounds(218, 72, 140, 20);
		txtApe.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				char d;
				d = Character.toLowerCase(c);
				if ((d < 'a' || d > 'z')) {// Se consume sino son letras
					if (d == ' ') {
					} else {
						e.consume();
					}

				}

			}
		});
		contentPane.add(txtApe);
		txtApe.setColumns(10);

		txtCod = new JTextField();// Campo de texto del codigo
		txtCod.setBounds(218, 109, 140, 20);
		txtCod.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((c < '0' || c > '9')) {// Se consume sino son n?meros
					e.consume();
				} else {
					if (txtCod.getText().length() > 5) {// Se limita el numero de caracteres
						e.consume();
					}
				}

			}
		});
		contentPane.add(txtCod);
		txtCod.setColumns(10);

		txtPar1 = new JTextField();// Campo de texto del parcial 1
		txtPar1.setColumns(10);
		txtPar1.setBounds(218, 134, 140, 20);
		txtPar1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((c < '0' || c > '9')) {// Se consume sino son n?meros
					e.consume();
				} else {
					if (txtPar1.getText().length() > 1) {// Se limita el numero de caracteres
						e.consume();
					}
				}

			}
		});
		contentPane.add(txtPar1);

		txtPar2 = new JTextField();// Campo de texto del parcial 2
		txtPar2.setColumns(10);
		txtPar2.setBounds(218, 159, 140, 20);
		txtPar2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((c < '0' || c > '9')) {// Se consume sino son n?meros
					e.consume();
				} else {
					if (txtPar2.getText().length() > 1) {// Se limita el numero de caracteres
						e.consume();
					}
				}

			}
		});
		contentPane.add(txtPar2);

		txtExa = new JTextField();// Campo de texto del examen
		txtExa.setColumns(10);
		txtExa.setBounds(218, 187, 140, 20);
		txtExa.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((c < '0' || c > '9')) {// Se consume sino son n?meros
					e.consume();
				} else {
					if (txtExa.getText().length() > 1) {// Se limita el numero de caracteres
						e.consume();
					}
				}

			}
		});
		contentPane.add(txtExa);
		JLabel lblTextoVer = new JLabel("");
		JButton btnAgregar = new JButton("Agregar");// Boton agregar
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Verificaciones de que los campos cumplan los requerimientos
				if (txtNom.getText().isEmpty() || txtNom.getText().equals(" ")) {
					lblTextoVer.setEnabled(true);
					lblTextoVer.setText("Ingrese un nombre");

				} else {
					if (txtApe.getText().isEmpty() || txtApe.getText().equals(" ")) {
						lblTextoVer.setEnabled(true);
						lblTextoVer.setText("Ingrese un apellido");

					} else {
						if (txtCod.getText().isEmpty()) {
							lblTextoVer.setEnabled(true);
							lblTextoVer.setText("Ingrese un c?digo");

						} else {
							if (txtPar1.getText().isEmpty()) {
								lblTextoVer.setEnabled(true);
								lblTextoVer.setText("Ingrese una nota para el parcial 1");

							} else {
								if (Integer.parseInt(txtPar1.getText()) > 50) {
									lblTextoVer.setEnabled(true);
									lblTextoVer.setText("La nota 1 no puede ser mayor a 50");

								} else {
									if (txtPar2.getText().isEmpty()) {
										lblTextoVer.setEnabled(true);
										lblTextoVer.setText("Ingrese una nota para el parcial 2");

									} else {
										if (Integer.parseInt(txtPar2.getText()) > 50) {
											lblTextoVer.setEnabled(true);
											lblTextoVer.setText("La nota 2 no puede ser mayor a 50");

										} else {
											if (txtExa.getText().isEmpty()) {
												lblTextoVer.setEnabled(true);
												lblTextoVer.setText("Ingrese una nota para el examen");

											} else {
												if (Integer.parseInt(txtExa.getText()) > 50) {
													lblTextoVer.setEnabled(true);
													lblTextoVer.setText("La nota del examen no puede ser mayor a 50");

												} else {
													lblTextoVer.setEnabled(false);// Se inhabilita el label de la
																					// advertencia
													lblTextoVer.setText("");
													String nomb;
													String apel;
													int codi;
													int parc1;
													int parc2;
													int exam;
													try {
														nomb = txtNom.getText();
														apel = txtApe.getText();
														codi = Integer.parseInt(txtCod.getText());
														parc1 = Integer.parseInt(txtPar1.getText());
														parc2 = Integer.parseInt(txtPar2.getText());
														exam = Integer.parseInt(txtExa.getText());
														// Se crea y se agrega el objeto de clase estudiante al
														// arraylist
														Lis.add(new Estudiante(nomb, apel, codi, parc1, parc2, exam));
													} catch (Exception e1) {

													}
													// Se llaman a los metodos determinados para limpiar los campos y
													// actualizar la tabla
													LimpiarCampos();
													DatosTabla();
												}
											}
										}
									}
								}
							}

						}
					}
				}

			}
		});
		btnAgregar.setForeground(Color.BLUE);
		btnAgregar.setBounds(382, 11, 89, 23);
		contentPane.add(btnAgregar);

		JButton btnSalir = new JButton("Salir");// Boton salir
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}
		});
		btnSalir.setForeground(Color.RED);
		btnSalir.setBounds(556, 11, 89, 23);
		contentPane.add(btnSalir);

		lblTextoVer.setForeground(Color.RED);
		lblTextoVer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTextoVer.setBounds(369, 124, 344, 52);
		lblTextoVer.setEnabled(false);
		contentPane.add(lblTextoVer);

		JButton btnEliminar = new JButton("Eliminar");// Boton eliminar
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indx;
				try {
					indx = TablaEstudiantes.getSelectedRow();// Selecciona la fila
					Lis.remove(indx);// Remueve el objeto del arraylist
				} catch (Exception e1) {// Excepcion por sino se selecciona correctamente
					JOptionPane.showMessageDialog(null, "Escoja una fila");
				}
				DatosTabla();// Se actualiza la tabla
			}
		});
		btnEliminar.setBounds(556, 92, 89, 23);
		contentPane.add(btnEliminar);

		JButton btnModificar = new JButton("Modificar Examen");// Boton para modificar el examen
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos;
				int examen;
				Estudiante aux;
				try {
					pos = TablaEstudiantes.getSelectedRow();// Se selecciona el objeto a cambiar
					aux = Lis.get(pos);
					examen = Integer.parseInt(JOptionPane.showInputDialog("Nuevo examen: "));// Se introduce el nuevo
																								// valor
					aux.setExa(examen);// Se cambia en el arraylist

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Escoja una fila");
				}
				DatosTabla();// Se actualiza la tabla
			}
		});
		btnModificar.setBounds(438, 45, 146, 23);
		contentPane.add(btnModificar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 243, 629, 178);
		contentPane.add(scrollPane);

		TablaEstudiantes = new JTable();// Se crea la tabla que contendra los objetos estudiantes
		TablaEstudiantes.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null }, }, new String[] { "Codigo", "Apellido",
						"Nombre", "Parcial 1 (35%)", "Parcial 2 (35%)", "Examen (30%)", "Definitiva" }));
		TablaEstudiantes.getColumnModel().getColumn(3).setPreferredWidth(101);
		TablaEstudiantes.getColumnModel().getColumn(4).setPreferredWidth(124);
		TablaEstudiantes.getColumnModel().getColumn(5).setPreferredWidth(104);
		scrollPane.setViewportView(TablaEstudiantes);

		lblPromedio.setBounds(379, 193, 290, 14);
		contentPane.add(lblPromedio);
		cargar();
		JButton btnGuardar = new JButton("Guardar");// Boton guardar
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File archivo = new File("src\\ficheros\\Estudiantes.txt");// Se localiza el fichero
				PrintWriter escribe;
				if (!archivo.exists()) {
					try {
						archivo.createNewFile();// Sino existe se crea el fichero

					} catch (Exception e1) {

					}
				}
				try {
					Estudiante aux;
					escribe = new PrintWriter(archivo, "utf-8");
					for (int i = 0; i < Lis.size(); i++) {
						aux = Lis.get(i);// Se escribe el archivo
						aux.guardar(escribe);
					}
					escribe.close();// Se cierra el archivo
				} catch (Exception e1) {

				}
				DatosTabla();// Se actualiza la tabla
			}
		});
		btnGuardar.setBounds(382, 92, 89, 23);
		contentPane.add(btnGuardar);
	}
}
