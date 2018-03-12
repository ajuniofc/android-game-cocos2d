package junio.com.br.bis.director;

import org.cocos2d.nodes.CCDirector;
import org.cocos2d.types.CGPoint;
import org.cocos2d.types.CGSize;

/**
 * Created by admin on 12/03/2018.
 */

public class DeviceSettings{

    public static CGPoint screenResolution(CGPoint point){
        return point;
    }

    public static float screenWidth(){
        return winSize().width;
    }

    public static float screenHeight(){
        return winSize().height;
    }

    public static CGSize winSize(){
        return CCDirector.sharedDirector().winSize();
    }
}
