package friday.behavioral.mediator;

public class Controller { // to test it I didn't use ResponseEntity
    private Service service;

    public Controller() {
        service = new Service();
    }

    public String get(Integer id) {
        return service.get(id);
    }

    public String put(Integer id, String string) {
        return service.put(id, string);
    }

    public String delete(Integer id) {
        return service.delete(id);
    }

    public boolean substituteWithId(Integer id1, Integer id2) {
        return service.substituteWithIds(id1, id2);
    }
}
