public class Q18_Singleton {
    static class AppConfig {
        private static AppConfig instance;
        String config = "default";
        private AppConfig(){}
        public static AppConfig getInstance(){
            if(instance==null) instance = new AppConfig();
            return instance;
        }
    }
    public static void main(String[] args){
        AppConfig a = AppConfig.getInstance();
        a.config = "prod";
        System.out.println(AppConfig.getInstance().config);
    }
}
