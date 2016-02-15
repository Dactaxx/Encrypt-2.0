package encrypt;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Window {
	public static JFrame frame = new JFrame("Encrypt 2.0");
	public static void createWindow() {
		frame.setSize(new Dimension(1000, 800));
		frame.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - 1000) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - 800) / 2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new GridBagLayout());
		
		frame.add(contentPanel);
		
		JButton encrypt = new JButton("Encrypt");
		JButton decrypt = new JButton("Decrypt");
		JTextArea input = new JTextArea(10, 50);
		input.setLineWrap(true);
		JTextArea output = new JTextArea(10, 50);
		output.setLineWrap(true);
		output.setEditable(false);
		JScrollPane scrollPaneInput = new JScrollPane(input);
		JScrollPane scrollPaneOutput = new JScrollPane(output);
		JTextField n = new JTextField(15);
		JTextField d = new JTextField(15);
		JTextField e = new JTextField(15);
		JLabel nl = new JLabel("n");
		JLabel dl = new JLabel("d");
		JLabel el = new JLabel("e");
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		contentPanel.add(nl, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		contentPanel.add(dl, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		contentPanel.add(el, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		contentPanel.add(n, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		contentPanel.add(d, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		contentPanel.add(e, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		contentPanel.add(encrypt, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		contentPanel.add(scrollPaneInput, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		contentPanel.add(decrypt, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		contentPanel.add(scrollPaneOutput, gbc);
		
		frame.setVisible(true);
		
		encrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent w) {
				output.setText(Encrypt.textToInt(input.getText(), Integer.parseInt(n.getText()), Integer.parseInt(e.getText())).toString());
				
			}
			
			
		});
		
		decrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
			
		});
		
	}
	
}
