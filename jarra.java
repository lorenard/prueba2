public class	Jarra	{
//variables	de	instancia
private	int	cantidad;
private	int	capacidad;
//constructor

public	Jarra(int	capacidadInicial){
if(capacidadInicial<=0){
throw	new	RuntimeException("ERROR:	no	se	pueden	crear	jarras	con	capacidad	menor"	+
"o	igual	que	cero.");
}

this.capacidad=capacidadInicial;

}
//		metodos

public	void	metodoComunitario(){	
//	Comentario	incluido	para	pruebas	
System.out.println("Aqui	escribimos	todos");
}