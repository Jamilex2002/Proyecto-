package application;


import java.util.List;

import Mensaje.dominio.Mensaje;
import Mensaje_rep.Mensaje_rep;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;



public class Main extends Application {
	Mensaje_rep msg = new Mensaje_rep();
	VBox ladoderecho = new VBox();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			ScrollPane scrollPane = new ScrollPane();
			scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
			  AnchorPane down = new AnchorPane();
			  ListView listView = new ListView() ;
			  
			  Image imageBuscador = new Image("https://cdn-icons-png.flaticon.com/512/3659/3659738.png",60,50,false,false);
				
			  	ImageView imageViewb = new ImageView();
				imageViewb.setImage(imageBuscador);
				
				
			  TextField tf1 =  new TextField("Busca un chat o inicia uno nuevo");
			  tf1.setLayoutX(90);
		      tf1.setLayoutY(10);
		      tf1.setAlignment(Pos.TOP_RIGHT);
		   
			  
			  
			VBox vBox=new VBox(listView);
			scrollPane.setContent(vBox);
			
					
		
			VBox vbox = new VBox (10);
			vbox.setStyle("-fx-background-color:LIGHTGOLDENRODYELLOW");
			HBox hbox = new HBox(10);
			//hbox.setAlignment(Pos.BASELINE_CENTER);
			Image image = new Image("https://cdn-icons-png.flaticon.com/512/2919/2919600.png", 120, 120,false, false);			
		       ImageView imageView = new ImageView();
				imageView.setImage(image);
			
				
				
				
			
			Label label1 =  new Label();
			label1.setText("USUARIO  :    ");
			//label1.setAlignment(Pos.CENTER);
			TextField tf =  new TextField();
			hbox.getChildren().addAll(label1,tf);
			
			HBox hbox1 = new HBox(10);
			//hbox1.setAlignment(Pos.BASELINE_CENTER);
			Label label2 =  new Label();
			label2.setText("CONTRASEÑA : ");
			PasswordField ps =  new PasswordField();
			hbox1.getChildren().addAll(label2,ps);
			
			
			
			HBox hbox2 = new HBox(10);
			//hbox2.setAlignment(Pos.BASELINE_CENTER);
			Button btn = new Button("ACCEDER");
			
			
			
		btn.setText("ACCEDER");
		btn.setAlignment(Pos.BOTTOM_CENTER);
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				AnchorPane root = new AnchorPane();
		        root.setStyle("-fx-background-color:LIGHTGOLDENRODYELLOW");
		       
		        root.setPrefSize(1000, 850);

		      
		        
		        //root.getChildren().addAll(scrollPane);
		        
		        
		        ObservableList<Mensaje> names = FXCollections.observableArrayList( Main.this.msg.getUser());
		        ListView<Mensaje> listView = new ListView<>(names);
		      
		        listView.setCellFactory(param -> new ListCell<Mensaje>() {
					@Override
				    protected void updateItem(Mensaje item, boolean empty) {
				        super.updateItem(item, empty);

				        if (empty || item == null || item.getTo() == null) {
				            setText(null);
				        } else {
				        	setPrefHeight(80);
				        	Image fondox1 = new Image("https://cdn-icons-png.flaticon.com/512/6073/6073874.png");
							setGraphic(new Circle(25, new ImagePattern(fondox1)));
							setId(item.getId()+"");
							setText(item.getTo()+"\t\t\t"+item.getDate()+"\n"+item.getContent());
				        }
				    }
				});
		        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
					
					@Override
					public void handle(MouseEvent event) {
						ladoderecho.getChildren().clear();
						System.out.println("Cliked on"+ listView.getSelectionModel().getSelectedIndex());
						
						ScrollPane contconv = new  ScrollPane();
						VBox conversacion = new VBox();
						conversacion.setPrefHeight(700);
						conversacion.setSpacing(20);
						contconv.setContent(conversacion);
						HBox escribirYenviar = new HBox();
						
						List<Mensaje> result = msg.getUser();
						for(Mensaje user : result) {
							int usercompare = user.getIduserfrom();
							int userlist =  listView.getSelectionModel().getSelectedIndex();
							if((usercompare) == userlist+1) {
								HBox encabezado = new HBox();
								Label usuariochat = new Label(user.getTo());
								Label horachat = new Label(user.getDate());
								Image fotochats = new Image("https://cdn-icons-png.flaticon.com/512/2919/2919600.png");
								ImageView imagenx1 = new ImageView(fotochats);
								imagenx1.setFitHeight(50);
								imagenx1.setFitWidth(50);
								VBox encab = new VBox();
								encab.setSpacing(5);
								encab.getChildren().addAll(usuariochat, horachat);
								encabezado.setSpacing(20);
								ladoderecho.getChildren().add(0,encabezado);
								encabezado.getChildren().addAll(imagenx1, encab);
								List<Mensaje> conversacionComplet = msg.getMessage(user.getTo(), "Jose"); 
								for(Mensaje mensj : conversacionComplet) {
									if (mensj.getTo().equals(user.getTo())) {
										Label mensajeEnv = new Label(mensj.getContent());
										HBox mensaje = new HBox();
										mensajeEnv.setTextAlignment(TextAlignment.JUSTIFY);
										mensajeEnv.setWrapText(true);		mensajeEnv.setMaxWidth(350);
												mensajeEnv.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 23));
												mensajeEnv.setStyle("-fx-background-color: GREY ; -fx-background-radius: 8px;");
												mensajeEnv.setPadding(new Insets(6));
												
												mensaje.getChildren().addAll(mensajeEnv);
												mensaje.setPrefWidth(605);
												mensaje.setAlignment(Pos.TOP_LEFT);
										conversacion.getChildren().addAll(mensaje);
										
										
									}else {
										
										Label mensajeEnv = new Label(mensj.getContent());
										HBox mensaje = new HBox();
										mensajeEnv.setTextAlignment(TextAlignment.JUSTIFY);
										mensajeEnv.setWrapText(true);		mensajeEnv.setMaxWidth(350);
												mensajeEnv.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 23));
												mensajeEnv.setStyle("-fx-background-color: Green; -fx-background-radius: 8px;");
												mensajeEnv.setPadding(new Insets(6));
												
												mensaje.getChildren().addAll(mensajeEnv);
												mensaje.setPrefWidth(605);
												mensaje.setAlignment(Pos.TOP_RIGHT);
										conversacion.getChildren().addAll(mensaje);
										
									}
									//FlowPane cuadroconvrs = new FlowPane();
									//Label from = new Label(mensj.getFrom());
									//Label to = new Label(mensj.getContent());
									//cuadroconvrs.getChildren().add(from);
									//cuadroconvrs.getChildren().add(to);
									//conversacion.getChildren().addAll(cuadroconvrs);
								    //conversacion.setAlignment( Pos.CENTER_LEFT);
								   //conversacion.setSpacing(100);
								}	
							}
						}
						
						TextField EscribirMsg = new TextField();
						EscribirMsg.setPromptText("Escriba su Mensaje...");
						EscribirMsg.setPrefSize(500,50);
						Button enviar = new Button("Enviar");
						enviar.setFont(Font.font("Comic Sans MS",FontWeight.LIGHT,15));
						
						enviar.setStyle("-fx-background-color: BISQUE");
						enviar.setMaxWidth(150);
						enviar.setMinHeight(30);
						enviar.setOnAction(new EventHandler<ActionEvent>() {

							@Override
							public void handle(ActionEvent arg0) {
								
								Label mensajeEnv = new Label(EscribirMsg.getText());
								HBox mensaje = new HBox();
								mensajeEnv.setTextAlignment(TextAlignment.JUSTIFY);
								mensajeEnv.setWrapText(true);		mensajeEnv.setMaxWidth(350);
										mensajeEnv.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 23));
										mensajeEnv.setStyle("-fx-background-color: Green; -fx-background-radius: 8px;");
										mensajeEnv.setPadding(new Insets(6));
										
										mensaje.getChildren().addAll(mensajeEnv);
										mensaje.setPrefWidth(605);
										mensaje.setAlignment(Pos.TOP_RIGHT);
								conversacion.getChildren().addAll(mensaje);
								EscribirMsg.clear();
								
								
							}
						});
						
						
					      
						escribirYenviar.setStyle("-fx-background-color: ALICEBLUE");
						escribirYenviar.getChildren().addAll(EscribirMsg,enviar);
						ladoderecho.getChildren().addAll(contconv,escribirYenviar);
					
						
					}
				});
		        
		
		     
		        
		       
				
				        
		        //scrollPane.setMaxSize(200, 2);
		        AnchorPane.setBottomAnchor(scrollPane, 40.40);
		        scrollPane.setStyle("-fx-background-color:lightseagreen");
		        AnchorPane.setTopAnchor(listView, 50.300);
		        AnchorPane.setBottomAnchor(listView, 0.00);
		        //AnchorPane.setRightAnchor(down, AnchorPane.USE_PREF_SIZE);
		        AnchorPane.setLeftAnchor(listView, 0.500);
		       
		        //AnchorPane right = new AnchorPane();
		        //right.setStyle("-fx-background-color:LIGHTGREY");
		        AnchorPane.setTopAnchor(ladoderecho, 0.0);
		        AnchorPane.setBottomAnchor(ladoderecho, 0.0);
		        AnchorPane.setRightAnchor(ladoderecho, 0.0);
		        AnchorPane.setLeftAnchor(ladoderecho, 248.10);
		       
		       
			     
			      
		        
		        root.getChildren().addAll(imageViewb,tf1,ladoderecho,listView, down);
		        
			      
		        Scene scene = new Scene(root);
		        primaryStage.setScene(scene);
		        primaryStage.show();
		        
		        
		        
		        
			}
				
			}
		);
			
			
			btn.setAlignment(Pos.CENTER_LEFT);
			
			
			
			
			Button btn1 = new Button("REPETIR");
			//btn1.setAlignment(Pos.BASELINE_CENTER);
			hbox2.getChildren().addAll(btn,btn1);
			vbox.getChildren().addAll(imageView,hbox, hbox1,hbox2,btn);
			
			
			
			
			
			
			BorderPane root = new BorderPane();
			
			Scene scene = new Scene(vbox,400,300);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
		    primaryStage.setTitle("MESAJERIA...");
			primaryStage.show();
			
			btn1.setOnAction(new EventHandler<ActionEvent>()
			{
				
				@Override
				public void handle(ActionEvent event) {
					tf.setText("");
					ps.setText("");
					
				}
			});
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}