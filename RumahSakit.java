package tugas1pbo;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RumahSakit extends JFrame{
    
    
    JLabel lblno=new JLabel("Nomor Registrasi");
    JTextField txno=new JTextField(20);
    JLabel lblnama=new JLabel("Nama Pasien");
    JTextField txnama=new JTextField(20);
    
    JLabel lblalamat=new JLabel("Alamat Pasien");
    JTextField txalamat=new JTextField(30);
    JLabel lbltlp=new JLabel("No . Telpon");
    JTextField txtlp=new JTextField(12);
    JLabel lbltjn=new JLabel("Poli Tujuan");
    JCheckBox PA = new JCheckBox("Poli Anak");
    JCheckBox PU = new JCheckBox("Poli Umum");
    JCheckBox PG = new JCheckBox("Poli Gizi");
    JCheckBox PK = new JCheckBox("Poli Kandungan");
    JCheckBox PP = new JCheckBox("Poli Penyakit Dalam");
    JCheckBox PB = new JCheckBox("Poli Bedah");
    JCheckBox RC = new JCheckBox("Poli Orthopaedi");
    JCheckBox PKK = new JCheckBox("Poli Kulit dan Kelamin");
    JCheckBox PN = new JCheckBox("Poli Kejiawaan");
    JLabel lblkelamin=new JLabel("Jenis Kelamin");
    JRadioButton lb = new JRadioButton("Laki-laki");
    JRadioButton de = new JRadioButton("Perempuan");
    ButtonGroup kelamin = new ButtonGroup(); 
    JLabel lblpekerjaan=new JLabel("Pekerjaan");
    JRadioButton sw = new JRadioButton("Swasta");
    JRadioButton ws = new JRadioButton("Wiraswasta");
    ButtonGroup pekerjaan = new ButtonGroup(); 
    JTextArea hasil=new JTextArea();
    JButton cetak = new JButton("Cetak");
    
    RumahSakit() 
    {
        setTitle("PENDAFTARAN PASIEN");
        setLocation(500,100);
        setSize(600,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void KomponenVisual()
    {
        getContentPane().setLayout(null);
        getContentPane().add(lblno);
        lblno.setBounds(30,10,130,20);
        getContentPane().add(txno);
        txno.setBounds(165,10,250,20);
        //
        getContentPane().add(lblnama);
        lblnama.setBounds(30,30,130,20);
        getContentPane().add(txnama);
        txnama.setBounds(165,30,250,20);
        //
        getContentPane().add(lblalamat);
        lblalamat.setBounds(30,50,130,20);
        getContentPane().add(txalamat);
        txalamat.setBounds(165,50,250,20);
        //
        getContentPane().add(lbltlp);
        lbltlp.setBounds(30,70,130,20);
        getContentPane().add(txtlp);
        txtlp.setBounds(165,70,130,20);
        //
        getContentPane().add(lbltjn);
        lbltjn.setBounds(30,90,130,20);
        getContentPane().add(PA);
        PA.setBounds(165,100,150,20);
        getContentPane().add(PU);
        PU.setBounds(330,110,150,20);
        getContentPane().add(PG);
        PG.setBounds(165,120,150,20);
        getContentPane().add(PK);
        PK.setBounds(330,130,150,20);
        getContentPane().add(PP);
        PP.setBounds(165,140,150,20);
        getContentPane().add(PB);
        PB.setBounds(330,150,150,20);
        getContentPane().add(RC);
        RC.setBounds(165,160,150,20);
        getContentPane().add(PKK);
        PKK.setBounds(330,170,150,20);
        //
         getContentPane().add(lblkelamin);
        lblkelamin.setBounds(30,210,130,20);
        kelamin.add(lb);
        kelamin.add(de);        
        getContentPane().add(lb);
        lb.setBounds (165,210,80,20);
        getContentPane().add(de);
        de.setBounds(255,210,100,20);
        //
        
        getContentPane().add(lblpekerjaan);
        lblpekerjaan.setBounds(30,230,130,20);
        pekerjaan.add(sw);
        pekerjaan.add(ws);        
        getContentPane().add(sw);
        sw.setBounds (165,230,80,20);
        getContentPane().add(ws);
        ws.setBounds(255,230,100,20);
        
        
        
        getContentPane().add(cetak);
        cetak.setBounds(50,260,300,20);
        getContentPane().add(hasil);
        hasil.setBounds(50,260,300,150);
        setVisible(true);
    }
    
    void AksiReaksi()
    {
        cetak.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                hasil.append("Nomor Registrasi        : "+txno.getText()+"\n");
                hasil.append("Nama Pasien        : "+txnama.getText()+"\n");
                hasil.append("Alamat        : "+txalamat.getText()+"\n");
                hasil.append("No . Telp     : "+txtlp.getText()+"\n");
                
                if(PA.isSelected()==true)
                {
                    hasil.append("Poli Tujuan     : "+PA.getText()+"\n");
                }
                if(PU.isSelected()==true)
                {
                    hasil.append("Poli Tujuan    : "+PU.getText()+"\n");
                }
                if(PG.isSelected()==true)
                {
                    hasil.append("Poli Tujuan     : "+PG.getText()+"\n");
                }
                if(PK.isSelected()==true)
                {
                    hasil.append("Poli Tujuan     : "+PK.getText()+"\n");
                }
                if(PP.isSelected()==true)
                {
                    hasil.append("Poli Tujuan    : "+PP.getText()+"\n");
                }
                if(PB.isSelected()==true)
                {
                    hasil.append("Poli Tujuan    : "+PB.getText()+"\n");
                }
                if(RC.isSelected()==true)
                {
                    hasil.append("Poli Tujuan    : "+RC.getText()+"\n");
                }
                if(PKK.isSelected()==true)
                {
                    hasil.append("Poli Tujuan    : "+PKK.getText()+"\n");
                }
                if(PN.isSelected()==true)
                {
                    hasil.append("Poli Tujuan    : "+PN.getText()+"\n");
                }
                if(lb.isSelected()==true)
                {
                    hasil.append("Kelamin      : "+lb.getText()+"\n");
                }
                if(de.isSelected()==true)
                {
                    hasil.append("Kelamin      : "+de.getText()+"\n");
                }
              if(sw.isSelected()==true)
                {
                    hasil.append("Pekerjaan    : "+sw.getText()+"\n");
                }
              if(ws.isSelected()==true)
                {
                    hasil.append("Pekerjaan    : "+ws.getText()+"\n");
                }
            }
        });
    }
     public static void main (String args[])
    {
            RumahSakit RS = new RumahSakit ();
            RS.KomponenVisual();
            RS.AksiReaksi();
       
    }
}
    

