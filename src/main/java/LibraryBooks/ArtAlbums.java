package LibraryBooks;

class ArtAlbums extends Book{
    private String paperQuality;
    public ArtAlbums(String name, int nrPages, String paperQuality) {
        super(name, nrPages);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return super.toString() + "ArtAlbums{" +
                "paperQuality='" + paperQuality + '\'' +
                '}';

    }
}

