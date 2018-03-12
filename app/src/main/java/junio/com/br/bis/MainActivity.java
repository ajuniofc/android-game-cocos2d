package junio.com.br.bis;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;

import junio.com.br.bis.scenes.TitleScreen;

public class MainActivity extends Activity {
    public static final int SCREEN_WIDTH = 320;
    public static final int SREEN_HEIGHT = 480;
    private CCGLSurfaceView mCcglSurfaceView;
    private CCScene scene;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupOrientationScreen();
        setupScreen();
        setupDirector();
        openSreen();
    }

    private void openSreen() {
        scene = new TitleScreen().scene();
        CCDirector.sharedDirector().runWithScene(scene);
    }

    private void setupDirector() {
        CCDirector.sharedDirector().setScreenSize(SCREEN_WIDTH, SREEN_HEIGHT);
    }

    private void setupScreen() {
        mCcglSurfaceView = new CCGLSurfaceView(this);
        setContentView(mCcglSurfaceView);
        CCDirector.sharedDirector().attachInView(mCcglSurfaceView);
    }

    private void setupOrientationScreen() {
        //	definindo	orientação	como	landscape
        setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
