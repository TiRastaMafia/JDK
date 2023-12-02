
package server;

import client.ClientWindow;

import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame {
    // Создание окна
    static private final int WINDOW_HEIGHT = 640;
    static private final int WINDOW_WIDTH = 720;
    static private final int WINDOW_POS_X = 100;
    static private final int WINDOW_POS_Y = 100;
    static private final String WINDOW_NAME = "Подключение к чату";



    // порт, который будет прослушивать наш сервер
    static final int PORT = 3443;
    // список клиентов, которые будут подключаться к серверу
    private ArrayList<ClientHandler> clients = new ArrayList<ClientHandler>();

    public ServerWindow() {

        // сокет клиента, это некий поток, который будет подключаться к серверу
        // по адресу и порту
        Socket clientSocket = null;
        // серверный сокет
        ServerSocket serverSocket = null;
        try {
            // создаём серверный сокет на определенном порту
            serverSocket = new ServerSocket(PORT);
            System.out.println("Сервер запущен!");
            JTextField loginField = new JTextField();
            JLabel loginLable = new JLabel("Логин");
            JTextField passwordField = new JTextField();
            JLabel passwordLable = new JLabel("Пароль");

            JButton buttonConnect = new JButton("Войти");

            JPanel grid = new JPanel(new GridLayout(5,1));
            setTitle(WINDOW_NAME);
            setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            grid.add(loginLable);
            grid.add(loginField);
            grid.add(passwordLable);
            grid.add(passwordField);
            grid.add(buttonConnect);
            add(grid);
            // Обработчик кнопки "Войти" (запускает чат)
            buttonConnect.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    try {
                        new ClientWindow(loginField.getText());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
            setVisible(true);

            // запускаем бесконечный цикл
            while (true) {
                // таким образом ждём подключений от сервера
                clientSocket = serverSocket.accept();
                // создаём обработчик клиента, который подключился к серверу
                // this - это наш сервер

                ClientHandler client = new ClientHandler(clientSocket, this);
                clients.add(client);
                // каждое подключение клиента обрабатываем в новом потоке
               new Thread(client).start();
            }

        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                // закрываем подключение
                clientSocket.close();
                System.out.println("Сервер остановлен");
                serverSocket.close();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // отправляем сообщение всем клиентам
    public void sendMessageToAllClients(String msg) {
        for (ClientHandler o : clients) {
            o.sendMsg(msg);
        }

    }

    // удаляем клиента из коллекции при выходе из чата
    public void removeClient(ClientHandler client) {
        clients.remove(client);
    }



}














//// – Создать окно клиента чата.
//// Окно должно содержать JtextField для ввода логина,
//// пароля, IP-адреса сервера, порта подключения к серверу,
//// область ввода сообщений,
//// JTextArea область просмотра сообщений чата и
//// JButton подключения к серверу и отправки сообщения в чат.
//// Желательно сразу сгруппировать
//// компоненты, относящиеся к серверу сгруппировать
//// на JPanel сверху экрана, а
//// компоненты, относящиеся к отправке сообщения –
//// на JPanel снизу.
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class ConnectWindow extends JFrame {
//
//
//    JTextField loginField = new JTextField("Введите ваш логин: ");
//    JTextField passwordField = new JTextField("Введите ваш пароль: ");
//    JTextField serverField = new JTextField("Введите адрес сервера и порт для подключения: ");
//    JButton buttonConnect = new JButton("Подключиться");
//
//    JPanel grid = new JPanel(new GridLayout(4,1));
//
//    ConnectWindow(){
//        //свойства окна
//        setTitle(WINDOW_NAME);
//        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//        grid.add(loginField);
//        grid.add(passwordField);
//        grid.add(serverField);
//        grid.add(buttonConnect);
//
//        add(grid);
//
//        buttonConnect.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e){
//                String login = loginField.getText().replace("Введите ваш логин: ", "");
//                new ChatWindow(login);
//            }
//        });
//
//        setVisible(true);
//    }
//}
