import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InterfaceJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gerenciamento de pedidos");

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        MenuBar menuBar = new MenuBar();

        Menu menuUsuario = new Menu("Usuário");
        Menu menuCliente = new Menu("Cliente");
        Menu menuTecido = new Menu("Tecido");
        Menu menuModelo = new Menu("Modelo");
        Menu menuPeca = new Menu("Peça");
        Menu menuOrcamento = new Menu("Orçamento");
        Menu menuPedido = new Menu("Pedido");

        menuBar.getMenus().addAll(menuUsuario, menuCliente, menuTecido, menuModelo, menuPeca, menuOrcamento, menuPedido);

        root.setLeft(menuBar);

        menuUsuario.setOnMouseClicked(event -> showPage("Usuário"));
        menuCliente.setOnMouseClicked(event -> showPage("Cliente"));
        menuTecido.setOnMouseClicked(event -> showPage("Tecido"));
        menuModelo.setOnMouseClicked(event -> showPage("Modelo"));
        menuPeca.setOnMouseClicked(event -> showPage("Peça"));
        menuOrcamento.setOnMouseClicked(event -> showPage("Orçamento"));
        menuPedido.setOnMouseClicked(event -> showPage("Pedido"));

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showPage(String pageName) {
        BorderPane page = new BorderPane();

        VBox buttonsBox = new VBox();
        buttonsBox.setSpacing(10);
        buttonsBox.setPadding(new Insets(10));

        Button criarButton = new Button("Criar");
        Button listarButton = new Button("Listar");
        Button atualizarButton = new Button("Atualizar");
        Button excluirButton = new Button("Excluir");

        buttonsBox.getChildren().addAll(criarButton, listarButton, atualizarButton, excluirButton);

        page.setTop(buttonsBox);

        Scene scene = new Scene(page, 800, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(pageName);
        stage.show();
    }
}
