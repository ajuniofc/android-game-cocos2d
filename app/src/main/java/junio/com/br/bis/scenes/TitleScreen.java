package junio.com.br.bis.scenes;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.types.CGPoint;

import junio.com.br.bis.Assets;
import junio.com.br.bis.sprites.ScreenBackground;

import static junio.com.br.bis.director.DeviceSettings.screenHeight;
import static junio.com.br.bis.director.DeviceSettings.screenResolution;
import static junio.com.br.bis.director.DeviceSettings.screenWidth;

/**
 * Created by admin on 12/03/2018.
 */

public class TitleScreen extends CCLayer {

    private ScreenBackground background;

    public TitleScreen(){
        getBackground();
    }

    private void getBackground() {
        this.background = new ScreenBackground(Assets.BACKGROUND);
        this.background.setPosition(screenResolution(CGPoint.ccp(
                screenWidth() /	2.0f,
                screenHeight() /	2.0f
        )));
        this.addChild(this.background);
    }

    // Prepara a tela para utilização e posicionamento dos elementos.
    // elementos: background, logo e botoes.
    public CCScene scene(){
        CCScene scene = CCScene.node();
        scene.addChild(this);
        return scene;
    }

}
