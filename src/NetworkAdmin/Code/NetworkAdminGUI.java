/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkAdmin.Code;

/**
 * @author Herwin
 * Hak Cipta dimiliki oleh Muhammad Herwindra Berlian
 * Asal Politeknik Elektronika Negeri Surabaya
 * Jurusan Teknik Komputer - 2210121035
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import java.lang.String.*;


public class NetworkAdminGUI extends JFrame implements ActionListener {

    JButton button1 = new JButton("Ping computer");
    JButton button2 = new JButton("network view");
    JButton button3 = new JButton("nslookup");
    JButton button4 = new JButton(" net users ");
    JButton button5 = new JButton("Tracert");
    JButton button6 = new JButton("syskey encryption");
    JButton button7 = new JButton("remote desktop");
    JButton button8 = new JButton(" netstat ");
    JButton button9 = new JButton("Remote shutdown");//shutdown.exe -i -l -s -r -a -f -m 
    JButton button10 = new JButton("ping of death (DOS)");
    JButton button11 = new JButton("exit program");
    JButton button12 = new JButton("OK!");
    JLabel textLabel3 = new JLabel("");
    JLabel textLabel = new JLabel("URL or IP address:");
    JTextField text = new JTextField("127.0.0.1  ", 17);
    JLabel textLabel2 = new JLabel("IPV4 or IPV6");
    //Create the window
    JTextArea textarea = new JTextArea(2, 25);
    JTextArea textarea2 = new JTextArea(2, 25);

    public NetworkAdminGUI() {


        super("WinzNet Apps");
        setSize(500, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container content = getContentPane();                             //membuat layout
        FlowLayout layout = new FlowLayout();
        content.setLayout(layout);

        Container contentArea = getContentPane();
        contentArea.setBackground(Color.black);                           //frame


        button1.addActionListener(this);
        button1.setBackground(Color.black);
        button1.setForeground(Color.red);
        content.add(button1);
        setContentPane(content);

        Color customgreen = new Color(128, 0, 128);
        Color customblack = new Color(128, 0, 128);




        button2.addActionListener(this);
        button2.setBackground(Color.black);
        button2.setForeground(Color.red);
        content.add(button2);
        setContentPane(content);

        button3.addActionListener(this);
        button3.setBackground(Color.black);
        button3.setForeground(Color.red);
        content.add(button3);
        setContentPane(content);

        button4.addActionListener(this);
        button4.setBackground(Color.black);
        button4.setForeground(Color.red);
        content.add(button4);
        setContentPane(content);

        button5.addActionListener(this);
        button5.setBackground(Color.black);
        button5.setForeground(Color.red);
        content.add(button5);
        setContentPane(content);

        button6.addActionListener(this);
        button6.setBackground(Color.black);
        button6.setForeground(Color.red);
        content.add(button6);
        setContentPane(content);


        button7.addActionListener(this);
        button7.setBackground(Color.black);
        button7.setForeground(Color.red);
        content.add(button7);
        setContentPane(content);

        button8.addActionListener(this);
        button8.setBackground(Color.black);
        button8.setForeground(Color.red);
        content.add(button8);
        setContentPane(content);

        button9.addActionListener(this);
        button9.setBackground(Color.black);
        button9.setForeground(Color.red);
        content.add(button9);
        setContentPane(content);

        button10.addActionListener(this);
        button10.setBackground(Color.black);
        button10.setForeground(Color.red);
        content.add(button10);
        setContentPane(content);

        button10.addActionListener(this);
        button10.setBackground(Color.black);
        button10.setForeground(Color.red);
        content.add(button10);
        setContentPane(content);

        button11.addActionListener(this);
        button11.setBackground(Color.black);
        button11.setForeground(Color.red);
        content.add(button11);
        setContentPane(content);

        //

        textLabel3.setForeground(Color.red);
        textLabel3.setBackground(Color.black);
        contentArea.add(textLabel3);
        setContentPane(content);

        textLabel.setForeground(Color.red);
        textLabel.setBackground(Color.black);
        contentArea.add(textLabel);
        setContentPane(content);
        //compnent interfaces
        text.setForeground(Color.red);
        text.setBackground(Color.black);
        contentArea.add(text);
        setContentPane(content);

        textLabel2.setForeground(Color.red);
        textLabel2.setBackground(Color.black);
        contentArea.add(textLabel2);
        setContentPane(content);



        textarea.setForeground(Color.red);
        textarea.setBackground(Color.black);
        contentArea.add(textarea);
        setContentPane(content);

        textarea2.setForeground(Color.red);
        textarea2.setBackground(Color.black);
        contentArea.add(textarea2);                           //rememeber for events the else{expression}
        setContentPane(content);





    } //end method

    public void actionPerformed(ActionEvent event) // user events and actions here
    {
        String clearscreen = ("\n\n\n\n\n\n\n\n\n\n\n\nresults cleared\n\n\n\n\n\n\n\n\n\n");
        String targetIP = text.getText();  //important code!

        //------------button 1------ping----//

        if (event.getSource() == button1) {
            try {



                String command1 = "C:\\WINDOWS\\system32\\ping.exe " + targetIP;
                Process p = Runtime.getRuntime().exec(command1);

                DataInputStream in = new DataInputStream(p.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));



                try {

                    while ((command1 = br.readLine()) != null) {
                        System.out.println(command1);

                        JLabel textLabel5 = new JLabel(command1);

                        Container content = getContentPane();                             //create layout manager
                        FlowLayout layout = new FlowLayout();
                        content.setLayout(layout);

                        Container contentArea = getContentPane();
                        contentArea.setBackground(Color.black);                           //container


                        textLabel5.setForeground(Color.red);
                        textLabel5.setBackground(Color.black);
                        contentArea.add(textLabel5);
                        setContentPane(content);


                    }
                } catch (IOException e) {
                }
            } catch (IOException e1) {


                System.err.println("trying another method for ping");



            }
        }





        try {
            String command1 = "C:\\WINNT\\system32\\ping.exe " + targetIP;
            Process p = Runtime.getRuntime().exec(command1);


            DataInputStream in = new DataInputStream(p.getInputStream()); //stream data input to show process

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            try {
                while ((command1 = br.readLine()) != null) { //readline from the bufferedReader
                    System.out.println(command1);


                    JLabel textLabel5 = new JLabel(command1);  //show results on GUI

                    Container content = getContentPane();                             //create layout manager
                    FlowLayout layout = new FlowLayout();
                    content.setLayout(layout);

                    Container contentArea = getContentPane();
                    contentArea.setBackground(Color.black);                           //container


                    textLabel5.setForeground(Color.red);
                    textLabel5.setBackground(Color.black);
                    contentArea.add(textLabel5);
                    setContentPane(content);


                }
            } catch (IOException e) {
            }
        } catch (IOException e1) {
            System.err.println();
            JLabel textLabel5 = new JLabel();

            Container content = getContentPane();                             //create layout manager
            FlowLayout layout = new FlowLayout();
            content.setLayout(layout);

            Container contentArea = getContentPane();
            contentArea.setBackground(Color.black);                           //container


            textLabel5.setForeground(Color.red);
            textLabel5.setBackground(Color.black);
            contentArea.add(textLabel5);
            setContentPane(content);


        }
        //-------button 2-----net view--//
        if (event.getSource() == button1) {
            return;
        }
        if (event.getSource() == button2) {
            try {



                String command2 = "C:\\WINDOWS\\system32\\net view ";
                Process p2 = Runtime.getRuntime().exec(command2);

                DataInputStream in = new DataInputStream(p2.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));



                try {

                    while ((command2 = br.readLine()) != null) {
                        System.out.println(command2);

                        JLabel textLabel5 = new JLabel(command2);

                        Container content = getContentPane();                             //create layout manager
                        FlowLayout layout = new FlowLayout();
                        content.setLayout(layout);

                        Container contentArea = getContentPane();
                        contentArea.setBackground(Color.black);                           //container


                        textLabel5.setForeground(Color.red);
                        textLabel5.setBackground(Color.black);
                        contentArea.add(textLabel5);
                        setContentPane(content);


                    }
                } catch (IOException e) {
                }
            } catch (IOException e1) {


                System.err.println();



            }
        }



        try {


            String command2 = "C:\\WINNT\\system32\\net view ";
            Process p2 = Runtime.getRuntime().exec(command2);


            DataInputStream in = new DataInputStream(p2.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            try {
                while ((command2 = br.readLine()) != null) {
                    System.out.println(command2);


                    JLabel textLabel5 = new JLabel(command2);

                    Container content = getContentPane();                             //create layout manager
                    FlowLayout layout = new FlowLayout();
                    content.setLayout(layout);

                    Container contentArea = getContentPane();
                    contentArea.setBackground(Color.black);                           //container


                    textLabel5.setForeground(Color.red);
                    textLabel5.setBackground(Color.black);
                    contentArea.add(textLabel5);
                    setContentPane(content);

                }
            } catch (IOException e) {
            }
        } catch (IOException e1) {
            System.err.println();
            JLabel textLabel5 = new JLabel();

            Container content = getContentPane();                             //create layout manager
            FlowLayout layout = new FlowLayout();
            content.setLayout(layout);

            Container contentArea = getContentPane();
            contentArea.setBackground(Color.black);                           //container


            textLabel5.setForeground(Color.red);
            textLabel5.setBackground(Color.black);
            contentArea.add(textLabel5);
            setContentPane(content);
        }

        //-------button 3-----nslookup--//
        if (event.getSource() == button2) {
            return;
        }
        if (event.getSource() == button3) {
            try {



                String command2 = "C:\\WINDOWS\\system32\\nslookup " + targetIP;
                Process p2 = Runtime.getRuntime().exec(command2);

                DataInputStream in = new DataInputStream(p2.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));



                try {

                    while ((command2 = br.readLine()) != null) {
                        System.out.println(command2);

                        JLabel textLabel5 = new JLabel(command2);

                        Container content = getContentPane();                             //create layout manager
                        FlowLayout layout = new FlowLayout();
                        content.setLayout(layout);

                        Container contentArea = getContentPane();
                        contentArea.setBackground(Color.black);                           //container


                        textLabel5.setForeground(Color.red);
                        textLabel5.setBackground(Color.black);
                        contentArea.add(textLabel5);
                        setContentPane(content);


                    }
                } catch (IOException e) {
                }
            } catch (IOException e1) {


                System.err.println("trying another method ");



            }
        }



        try {


            String command2 = "C:\\WINNT\\system32\\nslookup " + targetIP;
            Process p2 = Runtime.getRuntime().exec(command2);


            DataInputStream in = new DataInputStream(p2.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            try {
                while ((command2 = br.readLine()) != null) {
                    System.out.println(command2);


                    JLabel textLabel5 = new JLabel(command2);

                    Container content = getContentPane();                             //create layout manager
                    FlowLayout layout = new FlowLayout();
                    content.setLayout(layout);

                    Container contentArea = getContentPane();
                    contentArea.setBackground(Color.black);                           //container


                    textLabel5.setForeground(Color.red);
                    textLabel5.setBackground(Color.black);
                    contentArea.add(textLabel5);
                    setContentPane(content);

                }
            } catch (IOException e) {
            }
        } catch (IOException e1) {
            System.err.println();
            JLabel textLabel5 = new JLabel();

            Container content = getContentPane();                             //create layout manager
            FlowLayout layout = new FlowLayout();
            content.setLayout(layout);

            Container contentArea = getContentPane();
            contentArea.setBackground(Color.black);                           //container


            textLabel5.setForeground(Color.red);
            textLabel5.setBackground(Color.black);
            contentArea.add(textLabel5);
            setContentPane(content);
        }

        //------------------button 4-----net user------//

        if (event.getSource() == button3) {
            return;
        }
        if (event.getSource() == button4) {
            try {



                String command2 = "C:\\WINDOWS\\system32\\net user";
                Process p2 = Runtime.getRuntime().exec(command2);

                DataInputStream in = new DataInputStream(p2.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));



                try {

                    while ((command2 = br.readLine()) != null) {
                        System.out.println(command2);

                        JLabel textLabel5 = new JLabel(command2);

                        Container content = getContentPane();                             //create layout manager
                        FlowLayout layout = new FlowLayout();
                        content.setLayout(layout);

                        Container contentArea = getContentPane();
                        contentArea.setBackground(Color.black);                           //container


                        textLabel5.setForeground(Color.red);
                        textLabel5.setBackground(Color.black);
                        contentArea.add(textLabel5);
                        setContentPane(content);


                    }
                } catch (IOException e) {
                }
            } catch (IOException e1) {


                System.err.println("trying another method ");



            }
        }



        try {


            String command2 = "C:\\WINNT\\system32\\net user";
            Process p2 = Runtime.getRuntime().exec(command2);


            DataInputStream in = new DataInputStream(p2.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            try {
                while ((command2 = br.readLine()) != null) {
                    System.out.println(command2);


                    JLabel textLabel5 = new JLabel(command2);

                    Container content = getContentPane();                             //create layout manager
                    FlowLayout layout = new FlowLayout();
                    content.setLayout(layout);

                    Container contentArea = getContentPane();
                    contentArea.setBackground(Color.black);                           //container


                    textLabel5.setForeground(Color.red);
                    textLabel5.setBackground(Color.black);
                    contentArea.add(textLabel5);
                    setContentPane(content);

                }
            } catch (IOException e) {
            }
        } catch (IOException e1) {
            System.err.println();
            JLabel textLabel5 = new JLabel();

            Container content = getContentPane();                             //create layout manager
            FlowLayout layout = new FlowLayout();
            content.setLayout(layout);

            Container contentArea = getContentPane();
            contentArea.setBackground(Color.black);                           //container


            textLabel5.setForeground(Color.red);
            textLabel5.setBackground(Color.black);
            contentArea.add(textLabel5);
            setContentPane(content);
        }
        //----------------button 5-------tracert---//

        if (event.getSource() == button4) {
            return;
        }
        if (event.getSource() == button5) {
            try {



                String command2 = "C:\\WINDOWS\\system32\\tracert.exe " + targetIP;
                Process p2 = Runtime.getRuntime().exec(command2);

                DataInputStream in = new DataInputStream(p2.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));



                try {

                    while ((command2 = br.readLine()) != null) {
                        System.out.println(command2);

                        JLabel textLabel5 = new JLabel(command2);

                        Container content = getContentPane();                             //create layout manager
                        FlowLayout layout = new FlowLayout();
                        content.setLayout(layout);

                        Container contentArea = getContentPane();
                        contentArea.setBackground(Color.black);                           //container


                        textLabel5.setForeground(Color.red);
                        textLabel5.setBackground(Color.black);
                        contentArea.add(textLabel5);
                        setContentPane(content);


                    }
                } catch (IOException e) {
                }
            } catch (IOException e1) {


                System.err.println("trying another method ");



            }
        }



        try {


            String command2 = "C:\\WINNT\\system32\\tracert.exe " + targetIP;
            Process p2 = Runtime.getRuntime().exec(command2);


            DataInputStream in = new DataInputStream(p2.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            try {
                while ((command2 = br.readLine()) != null) {
                    System.out.println(command2);


                    JLabel textLabel5 = new JLabel(command2);

                    Container content = getContentPane();                             //create layout manager
                    FlowLayout layout = new FlowLayout();
                    content.setLayout(layout);

                    Container contentArea = getContentPane();
                    contentArea.setBackground(Color.black);                           //container


                    textLabel5.setForeground(Color.red);
                    textLabel5.setBackground(Color.black);
                    contentArea.add(textLabel5);
                    setContentPane(content);

                }
            } catch (IOException e) {
            }
        } catch (IOException e1) {
            System.err.println();
            JLabel textLabel5 = new JLabel();

            Container content = getContentPane();                             //create layout manager
            FlowLayout layout = new FlowLayout();
            content.setLayout(layout);

            Container contentArea = getContentPane();
            contentArea.setBackground(Color.black);                           //container


            textLabel5.setForeground(Color.red);
            textLabel5.setBackground(Color.black);
            contentArea.add(textLabel5);
            setContentPane(content);

        }
        //-----------button 6--------syskey---//

        if (event.getSource() == button5) {
            return;
        }
        if (event.getSource() == button6) {
            try {



                String command2 = "C:\\WINDOWS\\system32\\syskey.exe";
                Process p2 = Runtime.getRuntime().exec(command2);

                DataInputStream in = new DataInputStream(p2.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));



                try {

                    while ((command2 = br.readLine()) != null) {
                        System.out.println(command2);

                        JLabel textLabel5 = new JLabel(command2);

                        Container content = getContentPane();                             //create layout manager
                        FlowLayout layout = new FlowLayout();
                        content.setLayout(layout);

                        Container contentArea = getContentPane();
                        contentArea.setBackground(Color.black);                           //container


                        textLabel5.setForeground(Color.red);
                        textLabel5.setBackground(Color.black);
                        contentArea.add(textLabel5);
                        setContentPane(content);


                    }
                } catch (IOException e) {
                }
            } catch (IOException e1) {


                System.err.println("trying another method ");



            }
        }



        try {


            String command2 = "C:\\WINNT\\system32\\syskey.exe ";
            Process p2 = Runtime.getRuntime().exec(command2);


            DataInputStream in = new DataInputStream(p2.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            try {
                while ((command2 = br.readLine()) != null) {
                    System.out.println(command2);


                    JLabel textLabel5 = new JLabel(command2);

                    Container content = getContentPane();                             //create layout manager
                    FlowLayout layout = new FlowLayout();
                    content.setLayout(layout);

                    Container contentArea = getContentPane();
                    contentArea.setBackground(Color.black);                           //container


                    textLabel5.setForeground(Color.red);
                    textLabel5.setBackground(Color.black);
                    contentArea.add(textLabel5);
                    setContentPane(content);

                }
            } catch (IOException e) {
            }
        } catch (IOException e1) {
            System.err.println();
            JLabel textLabel5 = new JLabel();

            Container content = getContentPane();                             //create layout manager
            FlowLayout layout = new FlowLayout();
            content.setLayout(layout);

            Container contentArea = getContentPane();
            contentArea.setBackground(Color.black);                           //container


            textLabel5.setForeground(Color.red);
            textLabel5.setBackground(Color.black);
            contentArea.add(textLabel5);
            setContentPane(content);

        }  //-----------button 7--------remote desktop---------//

        if (event.getSource() == button6) {
            return;
        }
        if (event.getSource() == button7) {
            try {



                String command2 = "C:\\WINDOWS\\system32\\mstsc.exe";
                Process p2 = Runtime.getRuntime().exec(command2);

                DataInputStream in = new DataInputStream(p2.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));



                try {

                    while ((command2 = br.readLine()) != null) {
                        System.out.println(command2);

                        JLabel textLabel5 = new JLabel(command2);

                        Container content = getContentPane();                             //create layout manager
                        FlowLayout layout = new FlowLayout();
                        content.setLayout(layout);

                        Container contentArea = getContentPane();
                        contentArea.setBackground(Color.black);                           //container


                        textLabel5.setForeground(Color.red);
                        textLabel5.setBackground(Color.black);
                        contentArea.add(textLabel5);
                        setContentPane(content);


                    }
                } catch (IOException e) {
                }
            } catch (IOException e1) {


                System.err.println("trying another method ");



            }
        }



        try {


            String command2 = "C:\\WINNT\\system32\\mstcs.exe ";
            Process p2 = Runtime.getRuntime().exec(command2);


            DataInputStream in = new DataInputStream(p2.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            try {
                while ((command2 = br.readLine()) != null) {
                    System.out.println(command2);


                    JLabel textLabel5 = new JLabel(command2);

                    Container content = getContentPane();                             //create layout manager
                    FlowLayout layout = new FlowLayout();
                    content.setLayout(layout);

                    Container contentArea = getContentPane();
                    contentArea.setBackground(Color.black);                           //container


                    textLabel5.setForeground(Color.red);
                    textLabel5.setBackground(Color.black);
                    contentArea.add(textLabel5);
                    setContentPane(content);

                }
            } catch (IOException e) {
            }
        } catch (IOException e1) {
            System.err.println();
            JLabel textLabel5 = new JLabel();

            Container content = getContentPane();                             //create layout manager
            FlowLayout layout = new FlowLayout();
            content.setLayout(layout);

            Container contentArea = getContentPane();
            contentArea.setBackground(Color.black);                           //container


            textLabel5.setForeground(Color.red);
            textLabel5.setBackground(Color.black);
            contentArea.add(textLabel5);
            setContentPane(content);

        }
        //----------------button 8---null session---//
        if (event.getSource() == button7) {
            return;
        }
        if (event.getSource() == button8) {
            try {



                String command2 = "C:\\WINDOWS\\system32\\netstat";
                Process p2 = Runtime.getRuntime().exec(command2);

                DataInputStream in = new DataInputStream(p2.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));



                try {

                    while ((command2 = br.readLine()) != null) {
                        System.out.println(command2);

                        JLabel textLabel5 = new JLabel(command2);

                        Container content = getContentPane();                             //create layout manager
                        FlowLayout layout = new FlowLayout();
                        content.setLayout(layout);

                        Container contentArea = getContentPane();
                        contentArea.setBackground(Color.black);                           //container


                        textLabel5.setForeground(Color.red);
                        textLabel5.setBackground(Color.black);
                        contentArea.add(textLabel5);
                        setContentPane(content);


                    }
                } catch (IOException e) {
                }
            } catch (IOException e1) {


                System.err.println("trying another method ");



            }
        }



        try {


            String command2 = "C:\\WINNT\\system32\\netstat";
            Process p2 = Runtime.getRuntime().exec(command2);


            DataInputStream in = new DataInputStream(p2.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            try {
                while ((command2 = br.readLine()) != null) {
                    System.out.println(command2);


                    JLabel textLabel5 = new JLabel(command2);

                    Container content = getContentPane();                             //create layout manager
                    FlowLayout layout = new FlowLayout();
                    content.setLayout(layout);

                    Container contentArea = getContentPane();
                    contentArea.setBackground(Color.black);                           //container


                    textLabel5.setForeground(Color.red);
                    textLabel5.setBackground(Color.black);
                    contentArea.add(textLabel5);
                    setContentPane(content);

                }
            } catch (IOException e) {
            }
        } catch (IOException e1) {
            System.err.println();
            JLabel textLabel5 = new JLabel();

            Container content = getContentPane();                             //create layout manager
            FlowLayout layout = new FlowLayout();
            content.setLayout(layout);

            Container contentArea = getContentPane();
            contentArea.setBackground(Color.black);                           //container


            textLabel5.setForeground(Color.red);
            textLabel5.setBackground(Color.black);
            contentArea.add(textLabel5);
            setContentPane(content);

        }
        //----------------button 9 -----remote shutdown---//
        if (event.getSource() == button8) {
            return;
        }
        if (event.getSource() == button9) {
            try {



                String command2 = "C:\\WINDOWS\\system32\\shutdown.exe -i -l -s -r -a -f -m ";
                Process p2 = Runtime.getRuntime().exec(command2);

                DataInputStream in = new DataInputStream(p2.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));



                try {

                    while ((command2 = br.readLine()) != null) {
                        System.out.println(command2);

                        JLabel textLabel5 = new JLabel(command2);

                        Container content = getContentPane();                             //create layout manager
                        FlowLayout layout = new FlowLayout();
                        content.setLayout(layout);

                        Container contentArea = getContentPane();
                        contentArea.setBackground(Color.black);                           //container


                        textLabel5.setForeground(Color.red);
                        textLabel5.setBackground(Color.black);
                        contentArea.add(textLabel5);
                        setContentPane(content);


                    }
                } catch (IOException e) {
                }
            } catch (IOException e1) {


                System.err.println("trying another method ");



            }
        }



        try {


            String command2 = "C:\\WINNT\\system32\\shutdown.exe -i -l -s -r -a -f -m ";
            Process p2 = Runtime.getRuntime().exec(command2);


            DataInputStream in = new DataInputStream(p2.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            try {
                while ((command2 = br.readLine()) != null) {
                    System.out.println(command2);


                    JLabel textLabel5 = new JLabel(command2);

                    Container content = getContentPane();                             //create layout manager
                    FlowLayout layout = new FlowLayout();
                    content.setLayout(layout);

                    Container contentArea = getContentPane();
                    contentArea.setBackground(Color.black);                           //container


                    textLabel5.setForeground(Color.red);
                    textLabel5.setBackground(Color.black);
                    contentArea.add(textLabel5);
                    setContentPane(content);

                }
            } catch (IOException e) {
            }
        } catch (IOException e1) {
            System.err.println();
            JLabel textLabel5 = new JLabel();

            Container content = getContentPane();                             //create layout manager
            FlowLayout layout = new FlowLayout();
            content.setLayout(layout);

            Container contentArea = getContentPane();
            contentArea.setBackground(Color.black);                           //container


            textLabel5.setForeground(Color.red);
            textLabel5.setBackground(Color.black);
            contentArea.add(textLabel5);
            setContentPane(content);
        }
        //----------------button 10 -----ping of death---//
        if (event.getSource() == button9) {
            return;
        }
        if (event.getSource() == button10) {
            try {

                String command2 = "C:\\WINDOWS\\system32\\ping.exe " + targetIP + " -l 65500";
                Process p2 = Runtime.getRuntime().exec(command2);




                String command3 = "C:\\WINDOWS\\system32\\ping.exe " + targetIP + "-t -l 65500";
                Process p3 = Runtime.getRuntime().exec(command3);






                DataInputStream in = new DataInputStream(p2.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));


                try {

                    while ((command2 = br.readLine()) != null) {
                        System.out.println(command2);
                        System.out.println(command3);
                        System.out.println("\n\n System error own's you 5y573m.3rr0r@gmail.com \n");
                        textarea.setText("###Attacking... leave this running for approx 5mins,\n in the mean time visit me on http://System-error.weebly.com ##");
                        System.out.println(command3);

                        JLabel textLabel5 = new JLabel();

                        Container content = getContentPane();                             //create layout manager
                        FlowLayout layout = new FlowLayout();
                        content.setLayout(layout);

                        Container contentArea = getContentPane();
                        contentArea.setBackground(Color.black);                           //container


                        textLabel5.setForeground(Color.red);
                        textLabel5.setBackground(Color.black);
                        contentArea.add(textLabel5);
                        setContentPane(content);













                    }
                } catch (IOException e) {
                }
            } catch (IOException e1) {


                System.err.println("trying another method ");



            }
        }



        try {

            String command2 = "C:\\WINNT\\system32\\ping.exe " + targetIP + " -l 65500";
            Process p2 = Runtime.getRuntime().exec(command2);


            String command3 = "C:\\WINNT\\system32\\ping.exe " + targetIP + "-t -l 65500";
            Process p3 = Runtime.getRuntime().exec(command3);

            DataInputStream in = new DataInputStream(p2.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            try {
                while ((command2 = br.readLine()) != null) {
                    System.out.println(command2);
                    System.out.println(command3);
                    System.out.println("\n\n System error own's you 5y573m.3rr0r@gmail.com \n");
                    textarea.setText("###Attacking... leave this running for approx 5mins,\n in the mean time visit me on http://System-error.weebly.com ##");
                    System.out.println(command3);


                    JLabel textLabel5 = new JLabel();

                    Container content = getContentPane();                             //create layout manager
                    FlowLayout layout = new FlowLayout();
                    content.setLayout(layout);

                    Container contentArea = getContentPane();
                    contentArea.setBackground(Color.black);                           //container


                    textLabel5.setForeground(Color.red);
                    textLabel5.setBackground(Color.black);
                    contentArea.add(textLabel5);
                    setContentPane(content);




                }
            } catch (IOException e) {
            }
        } catch (IOException e1) {
            System.err.println();
            JLabel textLabel5 = new JLabel();


        }
        //----------------button 10 -----Clear screen---//
        if (event.getSource() == button10) {
            return;
        }
        if (event.getSource() == button11) {
            try {

                System.exit(1);
            } catch (Exception e) {
                System.out.println("close program via top right or task manager");



            }
        }


    }

    public static void main(String[] args) {
        NetworkAdminGUI eg = new NetworkAdminGUI();
    }
}
// 31337   

