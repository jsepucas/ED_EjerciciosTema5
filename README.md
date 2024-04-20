# ED_EjerciciosTema5

Link ----> https://github.com/jsepucas/ED_EjerciciosTema5.git


## Aplicación de Ejercicios UAX
Esta es una aplicación basada en Java que proporciona una interfaz gráfica de usuario (GUI) para varios ejercicios. La aplicación está construida utilizando Java Swing para los componentes de la GUI y Maven para la gestión de dependencias.  
Compilación y Ejecución
Cuando se compila y ejecuta el código, se crea una ventana principal con una cuadrícula de botones. Cada botón corresponde a un ejercicio diferente. Los ejercicios incluyen:  
Suma de Números Naturales
Lista de Números Naturales
Contador de Dígitos
Valor Máximo en un Vector
Cálculo de Potencia
Conversión de Hexadecimal a Decimal
Cálculo de Combinaciones
Contador de Genes
Ordenamiento de Archivos
Búsqueda de Palabras
Gestión de Fechas
Al hacer clic en un botón, se abrirá una nueva ventana específica para el ejercicio elegido. Por ejemplo, si haces clic en el botón "Valor Máximo en un Vector", se abrirá una nueva ventana donde podrás introducir una serie de números (separados por comas), y el programa calculará y mostrará el valor máximo entre ellos.  
Estructura del Código
La clase principal es Main.java, que configura la ventana principal y los botones para cada ejercicio. Cada ejercicio tiene su propia clase (por ejemplo, ValorMaximoGUI.java para el ejercicio de Valor Máximo en un Vector), que define el comportamiento de la ventana específica del ejercicio.  
Alineación
La línea bottomPanel.setAlignmentX(Component.BOTTOM_ALIGNMENT); en Main.java se utiliza para alinear los botones en la parte inferior de la ventana principal.  
Ejecución de la Aplicación
Para ejecutar la aplicación, compila el archivo Main.java y ejecuta el método main. Esto lanzará la ventana principal de la aplicación. Desde allí, puedes seleccionar un ejercicio para ejecutar haciendo clic en el botón correspondiente.
