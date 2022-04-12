package friday.behavioral.mediator;

public class Service {
    private Repository repository;

    public Service() {
        repository = new Repository();
    }

    public String put(Integer id, String string) {
        return repository.put(id, string);
    }

    public String get(Integer id) {
        return repository.get(id);
    }
    public String delete(Integer id) {
        return repository.delete(id);
    }

    public boolean substituteWithIds(Integer id1, Integer id2) {
        String string = repository.get(id1);
        repository.put(id1, repository.get(id2));
        repository.put(id2,string);
        return true;
    }
}
