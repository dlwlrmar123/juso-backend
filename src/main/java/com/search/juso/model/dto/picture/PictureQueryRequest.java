package com.search.juso.model.dto.picture;

import com.search.juso.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 *
 * @author W.G.
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PictureQueryRequest extends PageRequest implements Serializable {

    /**
     * 搜索词
     */
    private String searchText;

    private static final long serialVersionUID = 1L;
}