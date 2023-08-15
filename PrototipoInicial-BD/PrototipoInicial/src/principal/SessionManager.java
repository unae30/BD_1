package principal;

public class SessionManager {
    private static SessionManager instance;
    private Funcionario loggedFuncionario;

    private SessionManager() {
        // Privado para garantir que apenas uma instância seja criada
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void setLoggedFuncionario(Funcionario funcionario) {
        loggedFuncionario = funcionario;
    }

    public Funcionario getLoggedFuncionario() {
        return loggedFuncionario;
    }
}
