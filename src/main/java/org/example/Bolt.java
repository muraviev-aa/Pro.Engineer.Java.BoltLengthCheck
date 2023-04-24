package org.example;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.*;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.awt.Color.WHITE;

public class Bolt extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel panel;
    private JButton table;
    private JTextField textField1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JTextField path;
    private JTextField textField14;
    private JButton button6;
    private JCheckBox checkBox1;
    private JTextField textField4;
    private JTextField pTextField1;
    private JTextField pTextField2;
    private JTextField pTextField3;
    private JTextField pTextField4;
    private JTextField pTextField5;
    private JTextField pTextField6;
    private JCheckBox checkbox1;
    private JTextField textField5;
    private JTextField textField6;
    private JCheckBox checkbox2;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField2;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField3;
    private JLabel label200;
    private JLabel label300;
    private JLabel label100;
    private JLabel label111;
    private JLabel label222;
    private JCheckBox checkbox3;
    private JTextField textField15;
    private final Object[] columns = new String[]{
            "Название", "Толщина шайбы", "Высота гайки",
            "Длина резьбы", "Шаг резьбы", "Фаска"
    };
    private final Object data = new String[][]{
            {"M6", "1.6", "5.2", "18", "1", "1"},
            {"M8", "1.6", "6.8", "22", "1.25", "1.6"},
            {"M10", "2", "8.4", "26", "1.5", "1.6"},
            {"M12", "2.5", "10.8", "30", "1.75", "1.6"},
            {"M16", "3", "14.8", "38", "2", "2"},
            {"M20", "3", "18", "46", "2.5", "2.5"},
            {"M24", "4", "21.5", "54", "3", "2.5"},
            {"M30", "4", "25.6", "66", "3.5", "2.5"},
    };
    boolean flag1;
    boolean flag2;
    boolean flag3;
    boolean flag4;
    boolean flag5;
    boolean flag6;

    public Bolt() {
        super("Расчет длины болта");
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension(200, 30);
        table.setPreferredSize(dimension);
        button2.setPreferredSize(dimension);
        button3.setPreferredSize(dimension);
        button4.setPreferredSize(dimension);
        button5.setPreferredSize(dimension);
        button6.setPreferredSize(dimension);
        label200.setVisible(false);
        label300.setVisible(false);
        label100.setVisible(false);
        checkBox1.setVisible(false);
        setSize(1100, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        button6.addActionListener(e -> {
            try {
                createPdf();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        table.addActionListener(e -> tableCreate());
        checkbox1.addActionListener(e -> {
            textField4.setText("0");
            label111.setVisible(false);
            checkbox2.setVisible(false);
            checkbox3.setVisible(false);
            flag1 = true;
        });
        checkbox2.addActionListener(e -> {
            textField6.setText("0");
            label222.setVisible(false);
            checkbox1.setVisible(false);
            checkbox3.setVisible(false);
            flag2 = true;
        });
        button5.addActionListener(e -> calculate());
        button5.addActionListener(e -> {
            if (textField1.getText().isEmpty()) {
                textField1.setBackground(Color.RED);
                JOptionPane.showMessageDialog(null, "Укажите длину болта");
            } else if (Objects.equals(pTextField1.getText(), "0") || pTextField1.getText().isEmpty()) {
                pTextField1.setBackground(Color.RED);
                JOptionPane.showMessageDialog(null, "Укажите толщину элемента в пакете");
            } else if (textField11.getText().isEmpty()) {
                textField11.setBackground(Color.RED);
                JOptionPane.showMessageDialog(null, "Подгрузите данные из таблицы");
            }
        });
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setBackground(WHITE);
            }
        });
        pTextField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                pTextField1.setBackground(WHITE);
            }
        });
        button4.addActionListener(e -> {
            pTextField1.setText("0");
            pTextField2.setText("0");
            pTextField3.setText("0");
            pTextField4.setText("0");
            pTextField5.setText("0");
            pTextField6.setText("0");
        });
        button2.addActionListener(e -> {
            pTextField1.setText("0");
            pTextField2.setText("0");
            pTextField3.setText("0");
            pTextField4.setText("0");
            pTextField5.setText("0");
            pTextField6.setText("0");
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField7.setText("");
            textField8.setText("");
            textField9.setText("");
            textField10.setText("");
            textField11.setText("");
            textField12.setText("");
            textField13.setText("");
            textField14.setText("");
            textField15.setText("");
        });
        button3.addActionListener(e -> {
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField7.setText("");
            textField8.setText("");
            textField9.setText("");
            textField10.setText("");
            textField11.setText("");
            textField12.setText("");
            textField13.setText("");
            textField14.setText("");
            textField15.setText("");
        });
        checkbox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkbox1.setVisible(false);
                checkbox2.setVisible(false);
                label111.setVisible(false);
                label222.setVisible(false);
                textField4.setText("0");
                textField6.setText("0");
                flag3 = true;
            }
        });
    }

    /**
     * Округление
     */
    public double roundOne(double d) {
        double scale = Math.pow(10, 1);
        return Math.ceil(d * scale) / scale;
    }

    /**
     * Сумма толщин соединяемых пластин
     */
    public double sumPlates() {
        double p1 = Double.parseDouble(pTextField1.getText());
        double p2 = Double.parseDouble(pTextField2.getText());
        double p3 = Double.parseDouble(pTextField3.getText());
        double p4 = Double.parseDouble(pTextField4.getText());
        double p5 = Double.parseDouble(pTextField5.getText());
        double p6 = Double.parseDouble(pTextField6.getText());
        return p1 + p2 + p3 + p4 + p5 + p6;
    }

    /**
     * Сумма толщин гаек
     */
    public double nutThicknesses() {
        double n1 = Double.parseDouble(textField7.getText());
        double n2 = Double.parseDouble(textField8.getText());
        return n1 + n2;
    }

    /**
     * Сумма толщин шайб у гайки
     */
    public double thicknessWashers() {
        double w2 = Double.parseDouble(textField5.getText());
        double w3 = Double.parseDouble(textField6.getText());
        return w2 + w3;
    }

    /**
     * Определение где располагается резьба (пакет или шайба)
     */
    public void threadLocation(double b1, double b2) {
        if (b1 > b2) {
            double rsl1 = b2 - b1;
            textField2.setText(String.valueOf(rsl1));
            textField3.setText(null);
            /**
             * Проверка на заход резьбы в пакет не более 0.5 толщины
             */
            double h1 = Math.abs(Double.parseDouble(textField2.getText()));
            if (Double.parseDouble(pTextField6.getText()) == 0) {
                if (Double.parseDouble(pTextField5.getText()) == 0) {
                    if (Double.parseDouble(pTextField4.getText()) == 0) {
                        if (Double.parseDouble(pTextField3.getText()) == 0) {
                            if (Double.parseDouble(pTextField2.getText()) == 0) {
                                if (h1 > 0.5 * Double.parseDouble(pTextField1.getText())) {
                                    label200.setVisible(true);
                                    flag5 = true;
                                }
                            } else if (Double.parseDouble(pTextField2.getText()) != 0
                                    && h1 > 0.5 * Double.parseDouble(pTextField2.getText())) {
                                label200.setVisible(true);
                                flag5 = true;
                            }
                        } else if (Double.parseDouble(pTextField3.getText()) != 0
                                && h1 > 0.5 * Double.parseDouble(pTextField3.getText())) {
                            label200.setVisible(true);
                            flag5 = true;
                        }
                    } else if (Double.parseDouble(pTextField4.getText()) != 0
                            && h1 > 0.5 * Double.parseDouble(pTextField4.getText())) {
                        label200.setVisible(true);
                        flag5 = true;
                    }
                } else if (Double.parseDouble(pTextField5.getText()) != 0
                        && h1 > 0.5 * Double.parseDouble(pTextField5.getText())) {
                    label200.setVisible(true);
                    flag5 = true;
                }
            } else if (Double.parseDouble(pTextField6.getText()) != 0
                    && h1 > 0.5 * Double.parseDouble(pTextField6.getText())) {
                label200.setVisible(true);
                flag5 = true;
            }
        } else {
            double rsl2 = b2 - b1;
            textField3.setText(String.valueOf(rsl2));
            textField2.setText(null);
            /**
             * Проверка на заход резьбы в шайбу
             */
            double h2 = Double.parseDouble(textField5.getText()) + Double.parseDouble(textField6.getText());
            if (rsl2 > h2) {
                label100.setVisible(true);
                flag4 = true;
            }
        }
    }

    public void calculate() {
        label200.setVisible(false);
        label300.setVisible(false);
        label100.setVisible(false);
        flag4 = false;
        flag5 = false;
        flag6 = false;

        /**
         * Толщина шайбы под головкой болта
         */
        double w1 = Double.parseDouble(textField4.getText());

        /**
         * Длина болта
         */
        double l = Double.parseDouble(textField1.getText());

        /**
         * Толщина шайб, соед. элементов и гаек
         */
        double a = w1 + sumPlates() + thicknessWashers() + nutThicknesses();

        /**
         * Фактическая длина кончика болта
         */
        double c = l - a;
        textField9.setText(String.valueOf(roundOne(c)));

        /**
         * Длина резьбового конца
         */
        double d = Double.parseDouble(textField12.getText()) + Double.parseDouble(textField15.getText());
        textField10.setText(String.valueOf(d));

        /**
         * Сумма толщин первой шайбы и соединяемых элементов
         */
        double b1 = w1 + sumPlates();

        /**
         * Длина болта минус длина резьбы
         */
        double b2 = l - Double.parseDouble(textField13.getText());

        /**
         * Определение где располагается резьба
         */
        threadLocation(b1, b2);

        /**
         * Проверка выхода длины кончика болта
         */
        if (d > c) {
            label300.setVisible(true);
            flag6 = true;
        }
    }

    public void tableCreate() {
        JTable table = new JTable((Object[][]) data, columns);
        JFrame frame = new JFrame("Размеры метизов");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(650, 200);
        frame.add(new JScrollPane(table));
        frame.setVisible(true);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int i = table.getSelectedRow();
                TableModel model = table.getModel();
                textField4.setText(model.getValueAt(i, 1).toString());
                textField5.setText(model.getValueAt(i, 1).toString());
                textField6.setText(model.getValueAt(i, 1).toString());
                textField7.setText(model.getValueAt(i, 2).toString());
                textField8.setText(model.getValueAt(i, 2).toString());
                textField11.setText(model.getValueAt(i, 0).toString());
                textField11.setBackground(Color.GREEN);
                textField12.setText(model.getValueAt(i, 4).toString());
                textField13.setText(model.getValueAt(i, 3).toString());
                textField15.setText(model.getValueAt(i, 5).toString());
                label111.setVisible(true);
                label222.setVisible(true);
                checkbox1.setVisible(true);
                checkbox2.setVisible(true);
                checkbox3.setVisible(true);
            }
        });
    }

    public void createPdf() throws IOException {
        /**
         * Установка шрифта
         */
        String fontFilename = "./src/main/resources/arial.ttf";
        PdfFont font = PdfFontFactory.createFont(fontFilename, PdfEncodings.IDENTITY_H);

        /**
         * Работа с датой
         */
        Date dNow = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("Отчет создан: dd.MM.yyyy, hh:mm a zzz");

        String paraText = "Проверка болта " + textField11.getText()
                + " , l = " + textField1.getText() + " мм.";
        String paraText1 = "Соединяемые марки: " + textField14.getText() + ".";
        String paraText2 = "Толщины соединяемых элементов (мм): " + pTextField1.getText() + ", "
                + pTextField2.getText() + ", " + pTextField3.getText() + ", "
                + pTextField4.getText() + ", " + pTextField5.getText() + ", "
                + pTextField6.getText() + ".";
        String paraText3 = "Длина резьбового конца: " + textField9.getText() + " мм.";
        String paraText4 = "Резьба в пакете: " + textField2.getText() + " мм.";
        String paraText5 = "Резьба в шайбе: " + textField3.getText() + " мм.";
        String paraText6 = "Эскиз (количество соединяемых деталей показано условно):";
        String paraText7 = formatter.format(dNow);

        Paragraph paragraph = new Paragraph(paraText);
        Paragraph paragraph1 = new Paragraph(paraText1);
        Paragraph paragraph2 = new Paragraph(paraText2);
        Paragraph paragraph3 = new Paragraph(paraText3);
        Paragraph paragraph4 = new Paragraph(paraText4);
        Paragraph paragraph5 = new Paragraph(paraText5);
        Paragraph paragraph6 = new Paragraph(paraText6);
        Paragraph paragraph7 = new Paragraph(paraText7);

        PdfWriter pdfWriter = new PdfWriter(path.getText());
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);

        /**
         * Указание формата и поворот
         */
        pdfDocument.setDefaultPageSize(PageSize.A5.rotate());

        Document document = new Document(pdfDocument);
        /**
         * Назначение шрифта
         */
        document.setFont(font);

        document.add(paragraph);
        /**
         * Соединяемые марки
         */
        if (!textField14.getText().isEmpty()) {
            document.add(paragraph1);
        }
        /**
         * Толщины соединяемых элементов
         */
        document.add(paragraph2);
        /**
         * Длина резьбового конца
         */
        document.add(paragraph3);
        /**
         * Резьба в пакете
         */
        if (!textField2.getText().isEmpty()) {
            document.add(paragraph4);
        }
        /**
         * Резьба в шайбе
         */
        if (!textField3.getText().isEmpty()) {
            document.add(paragraph5);
        }

        /**
         * Эскиз болтового соединения
         */
        document.add(paragraph6);
        /**
         * Работа с эскизом болтового соединения
         */
        if (flag3) {
            String imgSrc = "./src/main/resources/bolt0_1.png";
            ImageData iData = ImageDataFactory.create(imgSrc);
            Image image = new Image(iData);
            document.add(image);
        } else if (flag1) {
            String imgSrc = "./src/main/resources/bolt0_2.png";
            ImageData iData = ImageDataFactory.create(imgSrc);
            Image image = new Image(iData);
            document.add(image);
        } else if (flag2) {
            String imgSrc = "./src/main/resources/bolt1_1.png";
            ImageData iData = ImageDataFactory.create(imgSrc);
            Image image = new Image(iData);
            document.add(image);
        } else {
            String imgSrc = "./src/main/resources/bolt1_2.png";
            ImageData iData = ImageDataFactory.create(imgSrc);
            Image image = new Image(iData);
            document.add(image);
        }

        /**
         * Предупреждение
         */
        if (flag4) {
            String paraText10 = "Предупреждение: не закрутится гайка.";
            Paragraph paragraph10 = new Paragraph(paraText10);
            document.add(paragraph10);
        } else if (flag5) {
            String paraText10 = "Предупреждение: резьба заходит в деталь больше чем на 0,5 толщины.";
            Paragraph paragraph10 = new Paragraph(paraText10);
            document.add(paragraph10);
        } else if (flag6) {
            String paraText10 = "Предупреждение: короткий резьбовой конец.";
            Paragraph paragraph10 = new Paragraph(paraText10);
            document.add(paragraph10);
        } else {
            String paraText10 = "Предупреждений нет.";
            Paragraph paragraph10 = new Paragraph(paraText10);
            document.add(paragraph10);
        }

        /**
         * Указание даты
         */
        document.add(paragraph7);
        document.close();
        System.out.println("PDF created");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Bolt::new);
    }
}
