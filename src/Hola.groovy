class Hola {
    static String loader() {
        def GroovyClassLoader = new GroovyClassLoader()
        def clazz = GroovyClassLoader.parseClass(new File("src/", "Prueba.txt"))
        assert clazz.name == 'Prueba'
        def prueba = clazz.newInstance()
        return prueba.doIt()
    }


    /*static String holaDeGroovy(){
        String saludo = "Hola desde groovy"
        return saludo;
    }*/
}