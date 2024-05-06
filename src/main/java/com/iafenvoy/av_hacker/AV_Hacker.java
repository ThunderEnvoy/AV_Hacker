package com.iafenvoy.av_hacker;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

import java.io.File;

@Mod("av_hacker")
public class AV_Hacker {
    private static final Logger LOGGER = LogUtils.getLogger();

    public AV_Hacker() {
        //删除傻逼版权界面的文件，显示Mod：[itlt]It's The Little Things
        File file = new File("./config/itlt/welcome.txt");
        if (file.exists())
            file.delete();
    }
}
