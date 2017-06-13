package Infrastructure.Specification;

public interface ISpecification<T> {
	public boolean IsSatisfiedBy(T t);	
}
