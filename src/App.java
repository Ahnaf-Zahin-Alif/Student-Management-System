
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

void main() {
    
        

        JFrame frame = new JFrame("Student Management System");
        frame.setSize(850 , 550);
        frame.setLayout(null);




        JLabel idLabel = new JLabel("Id");
        idLabel.setBounds(30 , 30 , 80 , 25);
        frame.add(idLabel);

        JTextField idField = new JTextField();
        idField.setBounds(130 , 30 , 200 , 25);
        frame.add(idField);


        JLabel firstNameLabel = new JLabel("First Name");
        firstNameLabel.setBounds(30 , 70 , 80 , 25);
        frame.add(firstNameLabel);

        JTextField firstNamefield = new JTextField();
        firstNamefield.setBounds(130 , 70 , 200 , 85);
        frame.add(firstNamefield);


        JLabel secondNameLabel = new JLabel("Last Name");
        secondNameLabel.setBounds(30 , 110 , 80 , 25);
        frame.add(secondNameLabel);

        JTextField secondNameField = new JTextField();
        secondNameField.setBounds(130 , 110 , 200 , 85);
        frame.add(secondNameField);

        
        JLabel genderLabel = new JLabel("Gender: ");
        genderLabel.setBounds(30 , 150 , 80 , 25);
        frame.add(genderLabel);

        JRadioButton maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(130 , 150 , 70 , 25);

        JRadioButton female









        frame.setVisible(true);



    
}
