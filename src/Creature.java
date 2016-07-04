
public abstract class Creature {
	int stat;
	int generation;
	boolean is_hungry;
	int coordX;
	int coordY;

	public Creature(int stat, int generation, Board board) {
		this.stat = stat;
		this.generation = generation;
	}

	public abstract void eat();

	public abstract boolean canSurvive();

	public abstract Creature[] reproduce();
}
