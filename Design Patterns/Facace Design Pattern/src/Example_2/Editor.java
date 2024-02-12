package Example_2;

public class Editor {
    private final Frameworks videoEditor;
    private final Frameworks photoEditor;
    private final Frameworks graphicEditor;

    public Editor(){
        videoEditor = new VideoEditor();
        photoEditor = new PhotoEditor();
        graphicEditor = new GraphicEditor();
    }

    public void videoEncoder(){
        videoEditor.encoding();
    }
    public void photoEncoder(){
        photoEditor.encoding();
    }
    public void graphicEncoder(){
        graphicEditor.encoding();
    }
    public void videoDecoder(){
        videoEditor.decoding();
    }
    public void photoDecoder(){
        photoEditor.decoding();
    }
    public void graphicDecoder(){
        graphicEditor.decoding();
    }
    public void videoFilter(){
        videoEditor.filtering();
    }
    public void photoFilter(){
        photoEditor.filtering();
    }
    public void graphicFilter(){
        graphicEditor.filtering();
    }
    public void videoCrop(){
        videoEditor.cropping();
    }
    public void photoCrop(){
        photoEditor.cropping();
    }
    public void graphicCrop(){
        graphicEditor.cropping();
    }
    public void videoMerge(){
        videoEditor.merging();
    }
    public void photoMerge(){
        photoEditor.merging();
    }
    public void graphicMerge(){
        graphicEditor.merging();
    }

}
