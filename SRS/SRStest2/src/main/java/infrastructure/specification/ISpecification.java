package infrastructure.specification;

public interface ISpecification<T> {
	public boolean IsSatisfiedBy(T t);	
}
