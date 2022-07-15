package crud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

public class MyApp {

	private JFrame frame;
	private JTextField uname;
	private JTextField email;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyApp window = new MyApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MyApp() {
		initialize();
		connect();
		loadData();
	}

	Connection cn;
	public JTable table;
	private JTextField uid;
	public void connect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/27jan","root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadData()
	{
		
		try {
			PreparedStatement ps = cn.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 679, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(226, 11, 210, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 76, 272, 195);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(21, 21, 59, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setBounds(21, 58, 59, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password");
		lblNewLabel_1_2.setBounds(21, 97, 59, 14);
		panel.add(lblNewLabel_1_2);
		
		uname = new JTextField();
		uname.setBounds(116, 18, 135, 20);
		panel.add(uname);
		uname.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(116, 55, 135, 20);
		panel.add(email);
		
		pass = new JTextField();
		pass.setColumns(10);
		pass.setBounds(116, 94, 135, 20);
		panel.add(pass);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				uname.setText("");
				email.setText("");
				pass.setText("");
				
				
			}
		});
		btnNewButton.setBounds(21, 138, 74, 23);
		panel.add(btnNewButton);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String myUname = uname.getText();
				String myEmail = email.getText();
				String myPass = pass.getText();
				
				try {
					PreparedStatement ps = cn.prepareStatement("insert into student values(?,?,?,?)");
					ps.setInt(1, 0);
					ps.setString(2, myUname);
					ps.setString(3, myEmail);
					ps.setString(4, myPass);
					
					int i = ps.executeUpdate();
					if(i>0)
					{
						JOptionPane.showMessageDialog(frame,"Data Inserted successfully !!!!");
						uname.setText("");
						email.setText("");
						pass.setText("");
						loadData();
					
					}
				
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnSubmit.setBounds(105, 138, 74, 23);
		panel.add(btnSubmit);
		
		JButton edit = new JButton("Edit");
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				int did = Integer.parseInt(uid.getText());
				String myUname = uname.getText();
				String myEmail = email.getText();
				String myPass = pass.getText();
				
				try {
					PreparedStatement ps = cn.prepareStatement("update student set uname=?, email=?,pass=? where id=?");
					ps.setString(1, myUname);
					ps.setString(2, myEmail);
					ps.setString(3, myPass);
					ps.setInt(4, did);
					
					int i = ps.executeUpdate();
					
					if(i>0)
					{
						JOptionPane.showMessageDialog(frame, "Data updated !!!");
						loadData();
					}
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		edit.setBounds(189, 138, 74, 23);
		panel.add(edit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(309, 76, 344, 195);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		panel_1.add(table, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(27, 282, 626, 94);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Student Id");
		lblNewLabel_2.setBounds(26, 44, 74, 14);
		panel_2.add(lblNewLabel_2);
		
		uid = new JTextField();
		uid.setBounds(92, 33, 137, 37);
		panel_2.add(uid);
		uid.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int did = Integer.parseInt(uid.getText());
				
				try {
					PreparedStatement ps = cn.prepareStatement("select * from student where id=?");
					ps.setInt(1, did);
					ResultSet rs = ps.executeQuery();
					if(rs.next())
					{
						uname.setText(rs.getString(2));
						email.setText(rs.getString(3));
						pass.setText(rs.getString(4));
					}
					else
					{
						JOptionPane.showMessageDialog(frame, "Data not found");
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_1.setBounds(289, 32, 89, 38);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Delete");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int did = Integer.parseInt(uid.getText());
				try {
					PreparedStatement ps = cn.prepareStatement("delete from student where id = ?");
					ps.setInt(1, did);
					int i = ps.executeUpdate();
					if(i>0)
					{
						JOptionPane.showMessageDialog(frame, "Data deleted!!!");
						loadData();
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton_1_1.setBounds(417, 32, 89, 38);
		panel_2.add(btnNewButton_1_1);
	}
}
