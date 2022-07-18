package br.com.sistemasmartsend.util;

import org.apache.log4j.Logger;


//utilizo a biblioteca log4j para captura dos logs
public class LogUtil {
        private LogUtil() {}
        public static Logger getLogger(Object obj) {
        	return Logger.getLogger(obj.getClass());
        }
}
