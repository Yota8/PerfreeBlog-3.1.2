package com.perfree.mapper;

import com.perfree.model.Option;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface OptionMapper {
    /**
     * 根据key获取option
     * @param key key
     * @return Option
     */
    Option getOptionByKey(String key);

    /**
     * 根据key更新value
     * @param option option
     * @return int
     */
    int updateValueByKey(Option option);

    /**
     * 获取启动时必要缓存的key
     * @return List<Option>
     */
    List<Option> getStartOption();

    /**
     * 插入option
     * @param option option
     * @return int
     */
    int addOption(Option option);

    int addOptionBySqlite(Option o);

    Integer getMaxId();

}

