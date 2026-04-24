package CreationalEnum;

public enum OSFactory {

    ANDROID {
        public OS create() {
            return new Android();
        }
    },

    IOS {
        public OS create() {
            return new IOS();
        }
    };

    public abstract OS create();
}
