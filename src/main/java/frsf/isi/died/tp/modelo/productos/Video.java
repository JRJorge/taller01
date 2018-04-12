package frsf.isi.died.tp.modelo.productos;


public class Video extends MaterialCapacitacion  {

	private Integer paginas;
	private Integer segundos;
	
	
	public Video() {}
	
	public Video(Integer id, String titulo) {}
	
	public Video(Integer id, String titulo, Double costo, Integer segundos){
		super(id, titulo, costo);
		this.segundos=segundos;
	}

	@Override
	public Double precio() {
		// TODO Auto-generated method stub
		return (getCosto() +this.segundos*getCosto());
	}

	@Override
	public Boolean esLibro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean esVideo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}