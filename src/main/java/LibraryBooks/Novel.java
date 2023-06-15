package LibraryBooks;

class Novel extends Book{
    private String type;
    public Novel(String name, int nrPages, String type) {
        super(name, nrPages);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "Novel{" +
                "type='" + type + '\'' +
                '}';
    }
}

