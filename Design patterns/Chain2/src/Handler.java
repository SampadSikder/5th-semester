public interface Handler {
    void setNext(Handler handler);
    void handleRequest(Request request);
}

// Concrete handler classes
class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    public void setNext(Handler handler) {
        nextHandler = handler;
    }

    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println("ConcreteHandler1 handles the request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler found for the request");
        }
    }
}

class ConcreteHandler2 implements Handler {
    private Handler nextHandler;

    public void setNext(Handler handler) {
        nextHandler = handler;
    }

    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println("ConcreteHandler2 handles the request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler found for the request");
        }
    }
}

// Request class
class Request {
    private RequestType type;

    public Request(RequestType type) {
        this.type = type;
    }

    public RequestType getType() {
        return type;
    }
}

// RequestType enumeration
enum RequestType {
    TYPE1, TYPE2, TYPE3
}
