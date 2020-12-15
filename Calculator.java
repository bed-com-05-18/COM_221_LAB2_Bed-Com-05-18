import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Calculator extends Application{
    private int firstNum;
    private int secondNum;
    private int displayOutPut;
    @Override
    public void start(Stage primaryStage){
        TextField textfield = new TextField("0");
        textfield.setMinSize(10, 30);
        textfield.setEditable(false);
        textfield.setAlignment(Pos.CENTER_RIGHT);

        HBox pane = new HBox(5);
        

        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        pane.setPadding(new Insets(3, 0, 3, 0));
        button7.setMinSize(30, 30);
        button8.setMinSize(30, 30);
        button9.setMinSize(30, 30);
        pane.getChildren().addAll(button7, button8,button9);

        HBox pane2 = new HBox(5);
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        button4.setMinSize(30, 30);
        button5.setMinSize(30, 30);
        button6.setMinSize(30, 30);
        pane2.setPadding(new Insets(3, 0, 3, 0));
        pane2.getChildren().addAll(button4, button5, button6);

        
        HBox pane3 = new HBox(5);
        Button button1 = new Button("1");
        button1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                textfield.setText("1");
                firstNum = 1;
            
            }
        });
        Button button2 = new Button("2");
        button2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                textfield.setText("2");
                secondNum = 2;

            }
        });
        Button button3 = new Button("3");
        button1.setMinSize(30, 30);
        button2.setMinSize(30, 30);
        button3.setMinSize(30, 30);
        pane3.setPadding(new Insets(3, 0, 3, 0));
        pane3.getChildren().addAll(button1, button2, button3);

        
        HBox pane4 = new HBox(5);
        Button button = new Button("C");
        Button button0 = new Button("0");
        Button button10 = new Button("=");
        button10.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
              displayOutPut = firstNum + secondNum;
              String finalDisplay = " " + displayOutPut;
              textfield.setText(finalDisplay);
            
            }
        });
        button.setMinSize(30, 30);
        button0.setMinSize(30, 30);
        button10.setMinSize(30, 30);
        pane4.setPadding(new Insets(3, 0, 3, 0));
        pane4.getChildren().addAll(button, button0, button10);

        
        VBox vboxx = new VBox(5);
        Button plus = new Button("+");
        plus.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                textfield.setText("+");
                displayOutPut = firstNum + displayOutPut;             
            }
        });
        Button minus = new Button("-");
        Button multi = new Button("*");
        Button div = new Button("/");
        plus.setMinSize(30, 30);
        minus.setMinSize(30, 30);
        multi.setMinSize(30, 30);
        div.setMinSize(30, 30);

        vboxx.setPadding(new Insets(5, 5, 5, 5));

        vboxx.getChildren().addAll(plus, minus, multi, div);

        VBox vbox = new VBox(); 
        pane.setPadding(new Insets(5, 0, 5, 0));
        vbox.getChildren().addAll(pane, pane2, pane3, pane4);

        BorderPane bpane = new BorderPane();
        bpane.setPadding(new Insets(10, 10, 10, 10));
        bpane.setTop(textfield);
        bpane.setCenter(vbox);
        bpane.setRight(vboxx);


        primaryStage.setScene(new Scene(bpane, 160, 200));
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}