/*
	 * Programa: Clase que contiene la interfaz principal
	 * Autor: Miguel Angel Naranjo Joya.
	 * Fecha:  22 de enero del 2021
*/
package paint;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	// Se crea el objeto que dibujara en el lienzo
	Dibujar dib = new Dibujar();

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
	public Interfaz() {

		setTitle("PAINT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(650, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		getContentPane().setLayout(null);

		color.setBounds(10, 80, 174, 25);
		contentPane.add(color);
		color.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChooseColor(dib);// Se crea unan nueva ventana para escoger color
				Borrador.setEnabled(true);// Se habilita el boton para borrar
			}
		});

		clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDibujo.repaint();// Se borra todo el lienzo
			}
		});

		// Se inicializan los componentes
		clean.setBounds(450, 80, 150, 25);
		contentPane.add(clean);

		grosorTrazo.setBounds(265, 40, 100, 25);
		grosorTrazo.setFont(f1);
		contentPane.add(grosorTrazo);

		grosor.setMaximum(30);
		grosor.setBounds(230, 80, 150, 25);
		contentPane.add(grosor);
		JComboBox BoxModo = new JComboBox();

		BoxModo.setMaximumRowCount(4);
		// Se agregan elementos al BoxModo
		BoxModo.addItem("Libre");
		BoxModo.addItem("Lineas");
		BoxModo.addItem("Cuadrados/Rectangulos");
		BoxModo.addItem("Circulos/Elipses");

		BoxModo.setSelectedIndex(0);
		BoxModo.setBounds(10, 43, 174, 22);
		contentPane.add(BoxModo);

		panelDibujo.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				if (BoxModo.getSelectedIndex() == 0) {// Si se arrastra el mouse se dibujara llamando a la funcion de la
														// clase Dibujar
					dib.pintar(e, grosor.getValue(), BoxModo.getSelectedIndex());
				}
			}
		});
		panelDibujo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dib.leerCoordenadas(e);//Si se presiona el mouse se leeran las coordenadas
				//Se mandan la posicion del mouse inicial
				dib.setIniX(e.getX());
				dib.setIniY(e.getY());

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (BoxModo.getSelectedIndex() == 1 || BoxModo.getSelectedIndex() == 2
						|| BoxModo.getSelectedIndex() == 3) {
					//Si se suelta el mouse, dependiendo de la figura seleccionada se dibujara esta
					dib.pintar(e, grosor.getValue(), BoxModo.getSelectedIndex());
				}
			}
		});

		panelDibujo.setBounds(10, 130, 600, 420);
		panelDibujo.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		panelDibujo.setBackground(Color.white);
		contentPane.add(panelDibujo);
		Borrador.addActionListener(new ActionListener() {//Boton borrador
			public void actionPerformed(ActionEvent e) {
				Borrador.setEnabled(false);//El boton se desactiva
				BoxModo.setSelectedIndex(0);//Se posiciona en modo libre de dibujo
				Color blanco = new Color(255, 255, 255);
				dib.color = blanco;//El color del trazo pasa a ser blanco
			}
		});
		Borrador.setBounds(450, 40, 150, 23);

		contentPane.add(Borrador);

		JLabel lblModo = new JLabel("Modo");//Label modo
		lblModo.setBounds(78, 18, 46, 14);
		contentPane.add(lblModo);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);//Se liberan los recursos
			}
		});
		btnSalir.setForeground(Color.RED);
		btnSalir.setBounds(260, 14, 89, 23);
		contentPane.add(btnSalir);
	}

	//Se crean componentes
	Font f1 = new Font("Segoe IU", Font.PLAIN, 15);
	JButton color = new JButton("Elegir Color");
	JButton clean = new JButton("Limpiar");
	JLabel grosorTrazo = new JLabel("GrosorTrazo");
	JSlider grosor = new JSlider();
	JPanel panelDibujo = new JPanel();
	private final JButton Borrador = new JButton("Borrador");
}
